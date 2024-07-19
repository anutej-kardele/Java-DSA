package Array;

public class MoveNegativeToEnd {

    public static void main(String[] args){

        // Input  [1, -1, 3, 2, -7, -5, 11, 6 ]
        // Output [1, 3, 2, 11, 6, -1, -7, -5]

        //  check which to shift and then left shift

        //int[] arr = {4,5,0,2,7,0,1,0};
        //int[] arr = {1, -1, 3, 2, -7, -5, 11, 6 };
        //int[] arr = {1, 3, -4, -9};
        int[] arr = {-5, 7, -3, -4, 9, 10, -1, 11};

        //arr = LeftShift(arr, 2);

        // Shifts from behind

        //for(int i = arr.length - 1; i >= 0; i--){
        //    if(arr[i] < 0) LeftShift(arr, i);
        //}

        // Shifts from front

        int currentArrayIndex = 0;
        int[] newArr = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 0) {
                newArr[currentArrayIndex] = arr[i];
                currentArrayIndex++;
            }
        }

        for (int i = 0; i < arr.length; i++){
            if(arr[i] < 0) {
                newArr[currentArrayIndex] = arr[i];
                currentArrayIndex++;
            }
        }


        for(Integer a : newArr){
            System.out.print(a + " ");
        }

    }

    public static int[] LeftShift(int[] arr, int indexValue){

        int temp = arr[indexValue];

        for(int i = arr.length - 1; i >= indexValue; i--){
            int temp2 = arr[i];
            arr[i] = temp;
            temp = temp2;
        }

        return arr;
    }
}
