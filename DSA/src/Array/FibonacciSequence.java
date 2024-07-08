package Array;

public class FibonacciSequence {

    public static void main(String[] args){

        PrintFibonacci(10);
    }

    public static void PrintFibonacci(int value){

        int arr[] = new int[value];

        arr[0] = 0;
        arr[1] = 1;
        
        for(int i = 0; i < value; i++){
            if(i != 0 && i != 1)arr[i] = arr[i -1] + arr[i -2];
            System.out.print(arr[i] + " ");
        }
        
    }
}
