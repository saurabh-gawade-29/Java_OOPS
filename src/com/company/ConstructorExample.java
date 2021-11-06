package com.company;

//Basic
//same name as class name
//does not return anything
//it's a basic function or method
//does not work with int float string void (Return type)
//constructor call only once when object is created
//Used to construct object

class Students{
    String name;
    int age;

    public void studentInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
//    Above is method and below is Constructor
//    see there is no return type like above
//    in above there is a public is access specifier and void return type
//    but in constructor there is no return type
//    First called this then code is execute

    Students(){
        System.out.println("Constructor Called \n");
    }

//  Parameterized Constructor
    Students(String college, int rollNo){
        System.out.println("Your college name is:" +college);
        System.out.println("and your roll number is: " +rollNo);
        System.out.println("\n");
    }
    //Copy Constructor
    //copy all the properties of object 1 to object  2

    Students(Students s3){
        this.name = s3.name;
        this.age = s3.age;
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Students s1 = new Students(); //students() -> it's also constructor
        // when we not create constructor, it's automatically create and called by java.
        s1.name = "Saurabh";
        s1.age = 24;
        s1.studentInfo();

        Students s2 = new Students("KJ Somaiya", 1);
//        s2.studentInfo();

        Students s3 = new Students(s1); // we can not create any properties for s3
//        we assign s1 properties/copy values to s3
        s3.studentInfo();
    }
}
