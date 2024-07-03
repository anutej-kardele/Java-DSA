
class Vehicle {
    String name;
    int number;

    public void CompileTimePoly(String name){
        System.out.println(name);
    }
    public void CompileTimePoly(int number){
        System.out.println(number);
    }
    public void CompileTimePoly(String name, int number){
        System.out.println(name + " - " + number);
    }
}

public class PolymorphismExp {
    
}
