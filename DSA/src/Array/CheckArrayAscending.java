package Array;

public class CheckArrayAscending {

    public static void main(String[] args){

        int arr1[] = {10, 40, 20, 70, 50};
        int arr2[] = {10, 20, 30, 40, 50};

        System.out.println("Arr1 ascending status is " + CheckAscending(arr1));
        System.out.println("Arr2 ascending status is " + CheckAscending(arr2));
    }


    public static boolean CheckAscending(int arr[]){

        for(int i = 0; i < arr.length - 2; i++){
            if(arr[i] > arr[i+1]) return false;
        }
        return true;
    }
}
