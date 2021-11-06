package com.company;

class Student{
//    Properties
    String name;
    int age;
//     Methods
    public void studentInfo(){
        System.out.println("name of student is: "+ this.name);
        System.out.println("age of student is: "+ this.age);
        System.out.println("\n");
    }
}

public class ObjectAndClassStudentExample {
    public static void main(String[] args) {
//        Object Create with new keyword and Student() is constructor
        Student s1 = new Student();
        s1.name = "Saurabh Gawade";
        s1.age = 24;
        s1.studentInfo();

//        Another Example of object creation
        Student s2 = new Student();
//        Assign value to properties
        s2.name = "Pradeep Gawade";
        s2.age = 54;
        s2.studentInfo();
    }
}
