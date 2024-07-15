package Array;

import java.util.HashMap;

public class FrequencyOfElement {

    public static void main(String[] args){

        int nums[] = {2,3,1,1,1,3,2};
        HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            if(data.containsKey(nums[i])) data.put(nums[i], data.get(nums[i]) + 1);
            else data.put(nums[i], 1);
        }

        for (HashMap.Entry<Integer, Integer> entry : data.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
