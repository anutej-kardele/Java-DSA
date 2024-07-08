package Array;

public class CheckPrime {

    public static void main(String[] args){

        System.out.println("5 Prime ? : " + IsPrime(5));
        System.out.println("33 Prime ? : " + IsPrime(33));
        System.out.println("37 Prime ? : " + IsPrime(37));
        System.out.println("53 Prime ? : " + IsPrime(53));
        System.out.println("81 Prime ? : " + IsPrime(81));
    }

    public static boolean IsPrime(int value){
        int divisible = 0;

        for(int i = 1; i <= value; i++){
            if(value%i == 0) divisible++;
        }

        if(divisible == 2) return true;
        else return false;
    }
}
