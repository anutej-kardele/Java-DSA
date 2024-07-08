package Array;
import java.util.Scanner;

public class ArrayRepresentation {

    public static void main(String[] args){

        // Declaring an array - Initialize
        int arr[] = new int[5];
        int []arr1 = new int[10];
        int[] arr2 = new int[10];
        int arr3[]  = {1,2,3,4,5};

        // storing value in array
        System.out.println("----------------Storing Value----------------");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            System.out.println("Enter the value for index = " + i);
            arr[i] = sc.nextInt();
        }

        // fetching value from array
        //System.out.println(arr[2]);
        System.out.println("----------------Fetching----------------");
        for (int i = 0; i < arr.length; i++){
            System.out.println("Value for index " + i + " is " + arr[i]);
        }

        // array work on linear data allocation
        // for example for an array [0,1,2,3,4]
        // if 0 is stored ar memory location of 200 & let's assume int takes 4 btye of memory then the others will be stored at
        // 1 - 204 , 2 - 208, 3 - 212, 4 - 216 in this order
        // arr[i] - 200 + (4 x i) | arr[0] - 200 + (4 x 0) | arr[2] - 200 + (4 x 2)
    }
}
