package muni.util;

import muni.model.Model;

public class DataQuality {
    public static class Address{
        public static boolean isValidForeignKeyRef(Model.PostalAddress in){
            return null != in && in.hasId()
                    && !in.hasStreetNum()
                    && !in.hasStreetName()
                    && !in.hasPostalCode();

        }//valid for forein key ref
        public static boolean isValidForInsert(Model.PostalAddress in) {
            if (null != in && in.hasId()==false) {// ID must be NULL
                //mandatory check
                if (in.hasStreetNum()
                        && in.hasStreetName()
                        && in.hasPostalCode()
                        && in.hasCreateTime() ==false//NO create ts
                        && in.hasUpdateTime() ==false//NO update ts
                ) {// streetname , streetnum, postcal code -
                    //if postal code is prsent, just the
                    //assume Canada - country code
                    // city can be derived from postal code.
                    return true; // valid insert
                } else {// new obj - mandarory FAIL
                    throw new RuntimeException("Insert=no ID, but the objct must have streetNum#, streetName, postalcode. Hint : Mandatory field missing?");
                }
            }
            return false;
        }

        public static boolean isValidForUpdate(Model.PostalAddress in) {
            // explict signal to update
            return null != in
                    && in.hasId() // ID must NOT be NULL - preexisting
                    //&& in.hasCreateTime() // signal: already created
                    //&& in.hasUpdateTime() // signal: already created
                    //&& in.getDirty() == true // Don' tcheck dirty - wont be set in json
                    ;
        }
    }
    public static class Person {

        public static boolean isValidForInsert(Model.Person in) {
            final var absent_id = !in.hasId();
            final var absent_createTS =!in.hasCreateTime();
            final var absent_updateTs =!in.hasUpdateTime();
            final var dirty = in.getDirty();//Don't bother to check this - as clients wont set this field in json.
            final var present_oneOf = ( in.hasEmail() || in.hasPhone1() || in.hasPhone2() || in.hasAddress()) ;
            final var present_mandatory = ( in.hasFirstName() &&  in.hasLastName()); //;&& _present_oneOf ;

            System.out.println("IsvalidforInsert:" + " present_mandatory="+present_mandatory+",present_oneof="+present_oneOf+",absent_id="+absent_id+",absent_createTS="+absent_createTS+",absent_updateTs="+absent_updateTs+" dirty="+dirty);

            if (null != in && absent_id) {// ID must be NULL
                // Yes no id, so insert.  Is data sufficient for business?
                if (present_mandatory
                        && present_oneOf //one contact channel
                        && absent_createTS //NO create ts
                        && absent_updateTs //NO update ts
                ) {//valid personfor insert
                    return true;
                } else {//new obj - but mandarory absent
                    //Log error? Not fatal
                    System.out.println("Checked: Person Not valid for insert.");
                    //throw new RuntimeException("Insert=no ID, but the objct must have fname, lname and one contact. Hint : Mandatory field missing?");
                }
            }//id empty
            return false;
        }//isvalidfor-insert

        public static boolean isValidForUpdate(Model.Person in) {
            final var present_id = in.hasId();
            final var has_create_time =in.hasCreateTime();
            final var has_update_time =in.hasUpdateTime();
            final var is_dirty = in.getDirty();//don't check dirty - clients won't set in json
            final var present_mandatory = (in.hasCreateTime() && in.hasUpdateTime());
            System.out.println("IsvalidforUpdate: present_id="+present_id+" has_create_time="+has_create_time+" has_update_time="+has_update_time+" is_dirty="+is_dirty);
            if (null != in &&  present_id) {// ID must NOT be NULL - preexisting
                if (present_mandatory // explict signal to update
                ) {
                    return true;
                } else {
                    //Log error? Not fatal
                    System.out.println("Checked: Person Not valid for Update.");
                    //throw new RuntimeException("Update=ID-present. BUT! timestamp expected for PRE-exiting obj. Hint : Ensure ts is prsent (though will overridden by db)?");
                }
            }
            return false;
        }//isvalidfor-update
    }
    /*
    public static class Address {
        public static boolean isValidForInsert(Model.PostalAddress in) {
            if (null != in && in.hasId() == false) {// ID must be NULL --for insert
                //mandatory check
                if (in.hasStreetNum() == true
                        && in.hasStreetName() == true
                        && in.hasPostalCode() == true
                        && in.hasCreateTime() == false //NO create ts
                        && in.hasUpdateTime() == false//NO update ts
                ) {// streetname , streetnum, postcal code -
                    //if postal code is prsent, just the
                    //assume Canada - country code
                    // city can be derived from postal code.
                    return true; // valid to insert
                } else {// new obj - mandarory FAIL
                    throw new RuntimeException("Insert=no ID, but the objct must have streetNum#, streetName, postalcode. Hint : Mandatory field missing?");
                }
            }
            return false;
        }

        public static boolean isValidForUpdate(Model.PostalAddress in) {
            // explict signal to update
            return null != in
                    && in.hasId() == true // ID must NOT be NULL - preexisting
                    && in.hasCreateTime() == true// signal: already created
                    && in.hasUpdateTime() == true// signal: already created
                    && in.getDirty() == true; //should be set by service  /PATCH
        }
    }

    public static class Person {
        public static boolean isValidForInsert(Model.Person in) {
            if (null != in && in.hasId() == false) {// ID must be NULL
                // Yes no id, so insert.  Is data sufficient for business?
                if (in.hasFirstName() == true //fn NOT empty
                        && in.hasLastName() == true //ln NOT empty
                        && in.hasCreateTime() == false//NO create ts
                        && in.hasUpdateTime() == false//NO update ts
                        && (in.hasAddress() == true // one of email/ phone/ address
                        || in.hasEmail() == true
                        || in.hasPhone1() == true
                        || in.hasPhone2() == true)//one contact channel
                ) {//valid personfor insert
                    return true;
                } else {//new obj - but mandarory absent
                    //return false;
                    throw new RuntimeException("Insert=no ID, but the objct must have fname, lname and one contact. Hint : Mandatory field missing?");
                }
            }//id empty
            return false;
        }//isvalidfor-insert

        public static boolean isValidForUpdate(Model.Person in) {
            final var id_is_empty = in.getId().isEmpty();
            final var has_create_time = in.hasCreateTime();
            final var has_update_time = in.hasUpdateTime();
            final var is_dirty = in.getDirty();
            System.out.println("IsvalidforUpdate: id_is_empty=" + id_is_empty + " has_create_time=" + has_create_time + " has_update_time=" + has_update_time + " is_dirty=" + is_dirty);
            if (null != in && id_is_empty == false) {// ID must NOT be NULL - preexisting
                if (has_create_time == true // signal: already created
                        && has_update_time == true // signal: already created
                        && is_dirty == true // explict signal to update
                ) {
                    return true;
                } else {
                    throw new RuntimeException("Update=ID-present. BUT! timestamp expected for PRE-exiting obj, dirty=true expected. Hint : Forgot to set dirty=true ?");
                }
            }
            return false;
        }//isvalidfor-update
    }*/

}
