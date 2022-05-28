import bank.*;
import java.util.*;


class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing somethings!!!");
    }

    public void printColor() {
        System.out.println(this.color); // this is a reserved keyword of java. this is rever to current object
    }
}


class Student {
    String name;
    int age;

    // Polymorphism
    // 1- compile time polymorphism => funcion overloading
    // 2- run time polymorphism => function overwriding

    public void printInfo(String name) {
        System.out.println(this.name);
    }

    public void printInfo(int age) {
        System.out.println(this.age);
    }

    public void printInfo(String name, int age) {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Default Constructor
    // Student() {

    // }

    // Parameterized Constructor
    // Student(String name, int age) {
    // this.name = name;
    // this.age = age;
    // }

    // Copy Constructor
    // Student(Student s2) {
    //     this.name = s2.name;
    //     this.age = s2.age;
    // }
}

class Shape{
    public void area(){
        System.out.println("Dispaly Area");
    }
}

class Triagnle extends Shape{
    public void area(int l , int h){
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println(2*3.142*r);
    }
}

class EquilateralTriangle extends Triagnle{
    public void area(int l , int h){
        System.out.println(1/2*l*h);
    }
}

abstract class Animal {
    abstract void walk();

    public void eats(){
        System.out.println("Animals eats");
    }

    Animal(){
        System.out.println("You are creating a new animal");
    }
}

class Horse  extends Animal{
    public void walk(){
        System.out.println("Walk on 4 legs");
    }

    Horse(){
        System.out.println("Created a hourse");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walk on 2 legs");
    }
}


interface Animals{
    int eyes = 2;
  public void walk();
}

interface Harbivore{

}

class Cow implements Animals ,Harbivore{ 
  public void walk(){
      System.out.println("Walk on 4 legs");
  }
}
public class OOPS {
    public static void main(String[] args) {
        // Pen dollarPen = new Pen();
        // dollarPen.color = "Blue";
        // dollarPen.type = "gel";

        // dollarPen.write();

        // Pen pen1 = new Pen();
        // pen1.color = "red";
        // pen1.type = "ballpoint";

        // pen1.printColor();
        // dollarPen.printColor();

        // Student s1 = new Student();
        // s1.name = "Muhammad Hamza Farooq";
        // s1.age = 23;
        // s1.printInfo();

        // Student s2 = new Student(s1);
        // s2.printInfo();

        // Student s1 = new Student();
        // s1.printInfo("Muhammad Hamza Farooq",23);

    //    bank.Account customer1 = new bank.Account();
    //    customer1.name = "Mirza Ziyad Ahmed baig" ;  
    
     Horse h = new Horse();
     h.walk();
     h.eats();

     Cow c = new Cow();
     c.walk();
    }
}