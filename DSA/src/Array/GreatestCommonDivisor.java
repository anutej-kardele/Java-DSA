package Array;

public class GreatestCommonDivisor {

    public static void main(String[] args){

        System.out.println("GCD of 18 & 24 is " + GCD(18,24));
    }

    public static int GCD(int v1, int v2){

        int value = (v1 < v2) ? v1 : v2;

        for(int i = value; i > 0; i--){
            if(v1 % i == 0 && v2 % i == 0) return i;
        }

        return 0;
    }

}

// explanation
// 24 - 1,2,3,4,6,8,12,24
// 18 - 1,2,3,6,9,18
// the max we can get is 18 as 18 < 24
// So now we check every number from 18, 17, 16, 15, 14, 13, 12, 11, 10.... and check for the common multiple
// if at same instance both are divisible then it will be written as GCD
