package com.company;
class StudentAll{
    String name;

//    common things are defined with static
    static String schoolName;

}

public class Static {
    public static void main(String[] args) {
//        no need to create object
//        no multiple objects its means no more memory
        StudentAll.schoolName = "KJ school";
        StudentAll obj = new StudentAll();
        obj.name = "Saurabh";
        System.out.println(obj.name+ " is in the " +obj.schoolName);
    }
}
