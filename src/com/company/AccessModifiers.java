package com.company;

class  PublicTest{
    public  String name; // public: access everywhere
    int AccNumber; // default: access everywhere within package
    protected String email; //protected: access everywhere within package and
    // we can use in another package but for subclasses
    private int accountNumber; // private for the class and we want to use so we use getters and setters


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
public class AccessModifiers {
    public static void main(String[] args) {
        PublicTest obj = new PublicTest();
        obj.name = "STRIVE";
        System.out.println(obj.name);

        obj.email="strive.gmail.com";
        System.out.println(obj.email);

//        we can access private variables by using getters and setters
        obj.setAccountNumber(12345);
        System.out.println(obj.getAccountNumber());

    }

}
