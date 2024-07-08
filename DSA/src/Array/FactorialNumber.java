package Array;

public class FactorialNumber {

    public static void main(String[] args){

        System.out.println("Factorial of 0 is " + Factorial(0));
        System.out.println("Factorial of 1 is " + Factorial(1));
        System.out.println("Factorial of 2 is " + Factorial(2));
        System.out.println("Factorial of 3 is " + Factorial(3));
        System.out.println("Factorial of 4 is " + Factorial(4));
        System.out.println("Factorial of 5 is " + Factorial(5));
    }

    public static int Factorial(int val){
        int fac = 1;
        for(int i = val; i > 0; i--) fac *= i;
        return fac;
    }
}
