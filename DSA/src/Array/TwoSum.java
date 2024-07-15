package Array;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args){

        int arr[] = {11,7,2,15};
        int target = 9;

        HashMap<Integer, Integer> dict = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            int temp = target - arr[i];

            if(dict.containsKey(temp)){

                System.out.println(dict.get(temp) + " : " + i);
                break;
            }

            dict.put(arr[i], i);
        }
    }
}
