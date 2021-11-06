package com.company;

class  Car{
//    properties
    String color;
    String model;
    int price;
    boolean sell;

//    Functions
    public void speed(){
        System.out.println("Car is super speed");
    }

    public void run(){
        System.out.println("Car is Running Now");
    }

    public void carColor(){
        System.out.println("The Color of car is: "+ this.color);
    }

    public void carType(){
        System.out.println("The Model of Car is: "+ this.model);
    }

    public void carPrice(){
        System.out.println("Price of car is: "+ this.price);
    }

    public void carSell(){
        if (sell){
            System.out.println("car is for selling \n");
        }
        else {
            System.out.println("Not for sell \n");
        }
    }
}

class Pen{
//    Properties
    String color;
    String type;

//    Functions or Methods
    public void write(){
        System.out.println("Write Something\n");
    }

//  property access using methods
    public void penColor(){
        System.out.println("the color is: "+this.color);
//        Here we use this keyword for access property
    }

//  property access using methods
    public void penType(){
        System.out.println("the type is: "+this.type);
    }
}

public class ObjectAndClasses {
    public static void main(String[] args) {
//      here we create an object using new keyword
        Pen pen1 = new Pen();
//      assign color
        pen1.color = "blue";
        pen1.penColor();
//      assign type
        pen1.type = "gel";
        pen1.penType();
        pen1.write();

//      here we create another object
        Pen pen2 = new Pen();
//      assign color
        pen2.color = "black";
        pen2.penColor();
//      assign Type
        pen2.type = "ballpoint";
        pen2.penType();
        pen2.write();

        Car car1 = new Car();
        car1.color = "Red";
        car1.carColor();
        car1.model="Tesla";
        car1.carType();
        car1.run();
        car1.speed();
        car1.sell = true;
        car1.carSell();

        Car car2 = new Car();
        car2.color = "Yellow";
        car2.carColor();
        car2.model = "lamborghini";
        car2.carType();
        car2.run();
        car2.price = 50000000;
        car2.carPrice();
        car2.sell = false;
        car2.carSell();
    }
}
