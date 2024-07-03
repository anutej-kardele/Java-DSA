// Java Classes
// A class in Java is a set of objects that shares common characteristics/ behavior and properties/ attributes. It is a user-defined blueprint or prototype from which objects are created. For example, a Student is a class while a particular student named Ravi is an object.

// Java Objects
// An object in Java is a basic unit of Object-Oriented Programming and represents real-life entities. Objects are the instances of a class that are created to use the attributes and methods of a class.  A typical Java program creates many objects, which as you know, interact by invoking methods

// use Upppercase letters to initialize class    "Pen"
// use loweCase letter to initialize functions   "displayData"

// this is a blueprint / prototype, we have not created a object yet
class Pen{
   // class has its PROPERTIES & METHODS

   // vriables defined inside a class are PROPERTIES / data
   String color;
   String type; // ball/gel pen

   // function defined inside a class are called METHODS / members
   public void displayData(){
      System.out.println("Pen is " + this.color + " in color & its a " + this.type);
   }
}

class Student{
   String name;
   int age;

   public void displayInfo(){
      System.out.println(this.name + " is " + this.age + " years old");
   }
}

public class ClassAndObject{
   public static void main(String[] args){
      /*Pen pen1 = new Pen(); // we have created a pen her - object
      pen1.color = "blue";
      pen1.type = "gel-pen";
      pen1.displayData();

      Pen pen2 = new Pen(); // we have created a pen her - object
      pen2.color = "black";
      pen2.type = "ball-pen";
      pen2.displayData();*/

      Student student1 = new Student(); 
      student1.name = "Anutej";
      student1.age = 23;
      student1.displayInfo();
   }
}
