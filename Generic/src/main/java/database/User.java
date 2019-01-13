package database;

public class User {
    String items;
//    String stID;
//    String stDOB;

    public User(){}
    public User(String item_name){
        this.items = items;
        // this.stID = stID;
    }
    //    public User(String stName, String stID, String stDOB){
//        this.stName = stName;
//        this.stID = stID;
//        this.stDOB = stDOB;
//
//    }
    public String getItem_name() {
        return items;
    }

    public void setItem_name(String items) {
        this.items = items;
    }

//    public String getStID() {
//        return stID;
//    }
//
//    public void setStID(String stID) {
//        this.stID = stID;
//    }
//
//    public String getStDOB() {
//        return stDOB;
//    }
//
//    public void setStDOB(String stDOB) {
//        this.stDOB = stDOB;
//    }
}