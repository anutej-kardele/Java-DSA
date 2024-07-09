package Array;

public class ArrayMinMax {

    public static void main(String[] args){

        int arr[] = {10, 23, 5, 86, 43, 109, 52, 47};

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] > maxValue) maxValue = arr[i];
            if(arr[i] < minValue) minValue = arr[i];
        }

        System.out.println("Min value is " + minValue);
        System.out.println("Max value is " + maxValue);
    }


}
