package Array;

public class SecondLargestInArray {

    public static void main(String[] args){

        int arr[] = {23, 45, 11, 10, 99, 264, 9};
        int maxFirstElement = Integer.MIN_VALUE;
        int maxSecondElement = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxFirstElement){
                maxSecondElement = maxFirstElement;
                maxFirstElement = arr[i];
            }
            else if(arr[i] > maxSecondElement){
                maxSecondElement = arr[i];
            }
        }

        System.out.println("Max First : " + maxFirstElement);
        System.out.println("Max Second : " + maxSecondElement);
    }
}
