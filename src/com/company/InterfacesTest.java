package com.company;

interface Animals{
    void walk(); // abstract and public method
}

interface Herbivore{

}

//Important
//Multiple inheritance we can achieve by interfaces
class Cow implements Animals, Herbivore{
    public  void walk(){
        System.out.println("Walk on 4 legs");
    }
}

public class InterfacesTest {
    public static void main(String[] args) {
        Cow c1 = new Cow();
        c1.walk();

    }
}
