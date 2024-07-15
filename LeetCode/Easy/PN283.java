package LeetCode.Easy;

public class PN283 {

    public static void main(String[] args) {
        //int[] nums = {0, 1, 0, 3, 12};
        //int[] arr = {1,0};
        int[] nums = {4,0,2,6,0};
        

        for(int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] == 0)LeftShilft(nums, i);
        }

        for (int i : nums) {
            System.out.print(i + " ");   
        }

        // using a new array to store the data 

        // int lastindex = nums.length - 1;
        // int firstIndex= 0;

        // int[] arr2 = new int[nums.length];

        // for(int i = 0; i < nums.length; i++){


        //     if(nums[i] == 0){
        //         arr2[lastindex] = nums[i];
        //         lastindex--;
        //     }
        //     else{
        //         arr2[firstIndex] = nums[i];
        //         firstIndex++;
        //     }
        // }

        // nums = arr2;

        // for (int i : nums) {
        //     System.out.print(i + " ");
        // }

    }

    public static int[] LeftShilft(int[] arr, int end){

        int temp = arr[end];
        
        for(int i = arr.length - 1; i >= end; i--){
            int val = arr[i];
            arr[i] = temp;
            temp = val;
        }

        return arr;
    }
}
