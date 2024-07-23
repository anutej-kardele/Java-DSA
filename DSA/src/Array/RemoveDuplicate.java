package Array;

import java.util.*;

public class RemoveDuplicate {

    public static void main(String[] args){


        int[] arr = {10,10,11,13,12,11};

        //int[] arr2 = UsingSet(arr);               // Using Set - order is not preserved
        //int[] arr2 = UsingHashMap(arr);           // using HashMap - order is not preserved
        //int[] arr2 = UsingList(arr);           // using List - order is preserved
        Object[] arr2 = UsingObject(arr);           // using List - order is preserved

        //for(int val : arr2) {
        //    System.out.print(val + " ");
        //}

        for(Object val : arr2) {
            System.out.print(val + " ");
        }

    }


    public static Object[] UsingObject(int[] arr){

        List<Integer> list = new ArrayList<>();

        for(int val : arr){
            if(!list.contains(val)){
                list.add(val);
            }
        }

        Object[] arr2 = list.toArray();

        return arr2;
    }

    public static int[] UsingList(int[] arr){


        List<Integer> list = new ArrayList<>();

        for(int val : arr){
           if(!list.contains(val)){
               list.add(val);
           }
        }

        int[] arr2 = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            arr2[i] = list.get(i);
        }

        return arr2;
    }

    public static int[] UsingSet(int[] arr){
        Set<Integer> setArr = new HashSet<>();

        for(int val : arr){
            setArr.add(val);
        }

        int[] arr2 = new int[setArr.size()];
        int i = 0;

        for(Integer integer : setArr){
            arr2[i] = integer;
            i++;
        }

        return arr2;
    }

    public static int[] UsingHashMap(int[] arr){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){

            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i], 1);
            }
        }

        System.out.println(map);

        int[] arr2 = new int[map.size()];
        int index = 0;

        for(Map.Entry<Integer, Integer> val : map.entrySet()){
            arr2[index] = val.getKey();
            index++;
        }

        return arr2;
    }
}
