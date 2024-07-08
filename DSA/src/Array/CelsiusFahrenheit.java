package Array;

public class CelsiusFahrenheit {

    public static void main(String[] args){

        System.out.println("100 cel to fah is " + GetFahrenheit(100));
        System.out.println("37 cel to fah is " + GetFahrenheit(37));
        System.out.println("0 cel to fah is " + GetFahrenheit(0));

        System.out.println("212 fah to cel is " + GetCelsius(212));
        System.out.println("32 fah to cel is " + GetCelsius(32));
        System.out.println("0 fah to cel is " + GetCelsius(0));
    }

    public static float GetFahrenheit(float cel){
        return (cel * 1.8f + 32);
    }

    public static float GetCelsius(float fah){
        return (fah - 32) * 5/9;
    }
}
