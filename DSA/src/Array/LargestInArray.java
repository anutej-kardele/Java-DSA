package Array;

public class LargestInArray {

    public static void main(String[] args){

        int arr1[] = {1,2,3,5,6};
        int arr2[] = {13,2,43,18,22};
        int arr3[] = {100,50,30,20,70};

        System.out.println("Largest in {1,2,3,5,6} is " + LargestNumber(arr1));
        System.out.println("Largest in {13,2,43,18,22} is " + LargestNumber(arr2));
        System.out.println("Largest in {100,50,30,20,70} is " + LargestNumber(arr3));
    }

    public static int LargestNumber(int arr[]){

        int largest = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest) largest = arr[i];
        }

        return largest;
    }
}
