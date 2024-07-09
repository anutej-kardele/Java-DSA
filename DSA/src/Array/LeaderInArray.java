package Array;

import java.util.ArrayList;
import java.util.List;

public class LeaderInArray {

    public static void main(String[] args){

        int arr[] = {16, 17, 4, 3, 5, 2};
        int lastLeader = Integer.MIN_VALUE;

        List<Integer> list=new ArrayList<Integer>();

        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] > lastLeader) {
                list.add(arr[i]);
                lastLeader = arr[i];
            }
        }

        for(int i = list.size() - 1; i >= 0; i--){
            System.out.print(list.get(i) + " ");
        }
    }
}
