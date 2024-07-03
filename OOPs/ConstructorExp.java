// Constructor
// A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes
// Constructors are used to create objects. There are 3 types of constructors in Java 
// the name of Class and it's constructor should be same 
// constructors will not return any data 
// A constructor can be called only once for an object 
// Types 
// 1. Non-parameterized constructor - we dont pass any values into it 
// 2. Parameterized constructor - we do pass the parameters we need at initialization 
// 3. Copy constructor - we pass in another instance of class i.e. object into this object

class StudentNew{
    String name;
    int age;

    public void displayInfo(){
        System.out.println(this.name + " is " + this.age + " years old");
    }

    // Non-parameterized constructor
    StudentNew(){
        System.out.println("Non-parametarized constructor has been called");
    }

    // Parameterized constructor
    StudentNew(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Parametarized constrctor has been called");
    }

    // Parameterized constructor
    StudentNew(int age){
        this.age = age;
        System.out.println("Parametarized constrctor has been called");
    }

    // Copy constructor
    StudentNew(StudentNew s2){
        this.name = s2.name;
        this.age = s2.age;
        System.out.println("Copy constructor has been called");
    }
}

public class ConstructorExp {
    public static void main(String args[]){
        StudentNew s1 = new StudentNew();
        s1.name = "Anutej";
        s1.age = 23;
        s1.displayInfo();

        StudentNew s2 = new StudentNew("Ansh", 14);
        s2.displayInfo();

        StudentNew s3 = new StudentNew(s1);
        s3.displayInfo();

        StudentNew s4 = new StudentNew(30);
        s4.displayInfo();                               // this will display null at name as it dose not have its value 
    }
}