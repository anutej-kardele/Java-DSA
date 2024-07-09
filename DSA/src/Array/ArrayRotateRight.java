package Array;

public class ArrayRotateRight {

    public static void main(String[] args){

        int arr[] = {5,1,8,3,7,15,9,2};

        RotateRight(arr, 3);
    }

    public static void RotateRight(int arr[], int numberOfRotation){

        for(int j = 0; j < numberOfRotation; j++){
            int temp = arr[arr.length - 1];
            for(int i = 0; i < arr.length; i++){
                int val = arr[i];
                arr[i] = temp;
                temp = val;
            }

            DisplayArray(arr);
            System.out.println("");
        }
    }


    public static void DisplayArray(int arr[]){
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}
