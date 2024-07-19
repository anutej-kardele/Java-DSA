package Concepts;

public class WrapperClassIntAndInteger {


    public static void main(String[] args){

        int num = 7;

        Integer num1 = new Integer(8);  // Boxing - Taking a primitive value and storing it into an object
        Integer num2 = 8; // AutoBoxing

        int num3 = num2.intValue(); // Unboxing - Getting a value from object type i.e. non-primitive to int type i.e. primitive type
        int num4 = num2; // AutoUnboxing



        // Advantage of Non-primitive type
        // Using "parse" functions

        String str = "12";
        int num5 = Integer.parseInt(str);    // using the help of parse function can convert different type of variable into another
        System.out.println(num5 * 2);

        // Integer String Boolean etc. classes are known as Wrapper classes
    }
}
