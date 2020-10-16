package muni.util;

import muni.model.Model;

public class DataQuality {
    public static class Address{
        public static boolean isValidForInsert(Model.PostalAddress in) {
            if (null != in && in.getId().isEmpty() == true) {// ID must be NULL
                //mandatory check
                if (in.getStreetNum().isEmpty() == false
                        && in.getStreetName().isEmpty() == false
                        && in.getPostalCode().isEmpty() == false
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
                    && in.getId().isEmpty() == false // ID must NOT be NULL - preexisting
                    && in.hasCreateTime() // signal: already created
                    && in.hasUpdateTime() // signal: already created
                    && in.getDirty() == true;
        }
    }
    public static class Person {
        public static boolean isValidForInsert(Model.Person in) {
            if (null != in && in.getId().isEmpty() == true) {// ID must be NULL
                // Yes no id, so insert.  Is data sufficient for business?
                if (in.getFirstName().isEmpty() == false //fn NOT empty
                        && in.getLastName().isEmpty() == false //ln NOT empty
                        && in.hasCreateTime() == false//NO create ts
                        && in.hasUpdateTime() == false//NO update ts
                        && (in.hasAddress()  // one of email/ phone/ address
                        || in.getEmail().isEmpty() == false
                        || in.getPhone1().isEmpty() == false
                        || in.getPhone2().isEmpty() == false)//one contact channel
                ) {//valid personfor insert
                    return true;
                } else {//new obj - but mandarory absent
                    throw new RuntimeException("Insert=no ID, but the objct must have fname, lname and one contact. Hint : Mandatory field missing?");
                }
            }//id empty
            return false;
        }//isvalidfor-insert

        public static boolean isValidForUpdate(Model.Person in) {
            final var id_is_empty = in.getId().isEmpty();
            final var has_create_time =in.hasCreateTime();
            final var has_update_time =in.hasUpdateTime();
            final var is_dirty = in.getDirty();
            System.out.println("IsvalidforUpdate: id_is_empty="+id_is_empty+" has_create_time="+has_create_time+" has_update_time="+has_update_time+" is_dirty="+is_dirty);
            if (null != in &&  id_is_empty == false) {// ID must NOT be NULL - preexisting
                if (has_create_time ==true // signal: already created
                        && has_update_time ==true // signal: already created
                        && is_dirty == true // explict signal to update
                ) {
                    return true;
                } else {
                    throw new RuntimeException("Update=ID-present. BUT! timestamp expected for PRE-exiting obj, dirty=true expected. Hint : Forgot to set dirty=true ?");
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
