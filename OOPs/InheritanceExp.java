class Shape{
    public void area(){

    }
}

class Circle extends Shape{
    public void area(int r){                                   // example of single level inheritance 
        System.out.println( (3.14) * r * r );                  
    }
}

class Traingle extends Shape{
    public void area(int l, int h){                             // example of single level inheritance 
        System.out.println( 0.5 * l * h );            
    }
}

// Circle and Traingle combined make a example of Hierarchial Inheritance 
// because there are multiple derived class from a base class 

class EquilateralTraingle extends Traingle{
    public void area(int side){                               // example of multi level in heritance        // EquilateralTraingle extends Traingle and Traingle extends Shape 
        System.out.println( (1.732/4) * side * side );        // ( 1.732 is root 3)
    }
}

// all this together is a example of Hybrid inheritance
// mainly its when we have hierarchial & multi level inheritance together 
// in the above example Shape class is been inherited by hierarchial inheritance by Traingle & Circle class 
// and been inherited by multi level inheritance by EquilateralTraingle class as it extends traingle and traingle extends Shape

// There is also a 5th type of inheritance called Multiple Inheritance it is not used in Java 
// to apply its comcepts we use interface 

public class InheritanceExp {
    public static void main(String[] args){
        
    }
}
