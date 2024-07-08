package Array;

public class SumOfDigits {

    public static void main(String[] args){

        System.out.println("Sum of digits of 135 is " + DigitsSum(135));
        System.out.println("Sum of digits of 6436455 is " + DigitsSum(6436455));
        System.out.println("Sum of digits of 7346 is " + DigitsSum(7346));
    }

    public static int DigitsSum(int val){

        int sum = 0;
        while (val > 0){
            sum += (val % 10);
            val /= 10;
        }

        return sum;
    }
}
