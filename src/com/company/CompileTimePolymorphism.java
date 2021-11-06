package com.company;
class Employee{

//      Compile Time Polymorphism is method Overloading

    public void empInfo(String name){
        System.out.println("the name of emp is: "+ name);
    }

    public void empInfo(int salary){
        System.out.println("the salary of emp is: "+salary);
    }

    public void empInfo(String name, int salary){
        System.out.println(name + "" + salary);
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.empInfo("saurabh"); // call first method
        e1.empInfo(10000); // this call second method
        e1.empInfo("saurabh", 50000); // this call third method

    }
}
