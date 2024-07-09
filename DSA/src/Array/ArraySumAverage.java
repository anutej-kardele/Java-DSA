package Array;

public class ArraySumAverage {

    public static void main(String[] args){

        int arr[] = {30, 10, 20, 70, 60, 50};

        System.out.println("Sum of element is " + ReturnSum(arr));
        System.out.println("Avg of element is " + ReturnSum(arr)/(arr.length));
    }

    public static int ReturnSum(int arr[]){

        int total = 0;
        for(int i = 0; i < arr.length; i++) total += arr[i];

        return total;
    }
}
