package Array;

public class ReverseArray {

    public static void main(String[] args){

        int arr[] = {1,2,44,7,5,98,14};
        //ReverseUsing2Variables();

        int n = arr.length - 1;
        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[n - i];
            arr[n - i] = temp;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static void ReverseUsing2Variables(){

        int arr[] = {1,2,44,7,5,98,14};
        int arr2[] = new int[arr.length];

        int increment = 0;
        for(int i = arr.length - 1; i >= 0; i--){
            arr2[increment] = arr[i];
            increment++;
        }

        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
