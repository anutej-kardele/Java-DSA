package Array;

import java.util.HashMap;
import java.util.Map;

public class ReturnDuplicates {

    public static void main(String[] args){

        int[] arr = {10,10,11,13,12,11};

        int[] arr2 = UsingHashmap(arr);

        for(int val : arr2){
            System.out.print(val + " ");
        }
    }

    public static int[] UsingHashmap(int[] arr){

        Map<Integer, Integer> map = new HashMap<>();

        int singleTonCount = 0;

        for(int i = 0; i < arr.length; i++){

            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i], 1);
                singleTonCount++;
            }
        }

        int[] arr2 = new int[arr.length - singleTonCount];
        int index = 0;

        for(Map.Entry<Integer, Integer> map2 : map.entrySet()){
            if(map2.getValue() != 1){
                arr2[index] = map2.getKey();
                index++;
            }
        }

        return arr2;
    }
}
