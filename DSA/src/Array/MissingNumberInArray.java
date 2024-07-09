package Array;

public class MissingNumberInArray {

    public static void main(String[] args){

        int arr[] = {1,2,3,5};
        System.out.println(ReturnMissingNumber(arr, 5));
    }

    static int ReturnMissingNumber(int array[], int n){

        int value = (n*(n+1))/2;
        int total = 0;
        for(int i = 0; i < n - 1; i++){
            total += array[i];
        }

        return value - total;
    }
}
