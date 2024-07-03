abstract class Animal {
    abstract void walk();
}

class Horse extends Animal {
    public void walk(){
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk(){
        System.out.println("Chicken walks on 2 legs");
    }
}

public class MultipleInheritance {
    // We cannot make an Animal walk or an instance of Animal 
    // We can make horse & chicke walk so instance will be created of horse & chicken
    // We can use abstract class or abstract method that should be declared by the child class
    public static void main(String args[]){
        Horse horse = new Horse();
        horse.walk();
    }
}
