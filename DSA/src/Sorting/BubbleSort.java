package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args){

        int[] nums = {-2, 45, 0, 11, -9};
        BubbleSortAlgo(nums);

        System.out.println(Arrays.toString(nums));


    }

    public static void BubbleSortAlgo(int[] nums) {

        for(int k = 0; k < nums.length; k++){
            for(int i = 0; i < nums.length - 1; i++){
                if(nums[i] > nums[i + 1]){
                    // sort
                    int temp = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = temp;
                }
            }
        }

    }
}
