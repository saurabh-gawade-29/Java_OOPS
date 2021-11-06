package com.company;

//we can create class abstract
//we can make abstract method
//it's just a concept we cannot create object with it.

//abstract keyword
//normal method and abstract methods acceptable.
//static methods and constructor are acceptable.

abstract class Animal{
    abstract void walk();

}

class Horse extends Animal{
    public  void  walk(){
        System.out.println("Walk on 4 legs");
    }

}

class Chicken extends Animal{
    public  void walk(){
        System.out.println("Walk on 2 legs");
    }
}

public class AbstractTest {
    public static void main(String[] args) {

    }
}
