package Collections;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args){

        // ArrayList
        // Duplicate objects are allowed
        // Insertion order is not preserved

        int arr[] = new int[10];  // array

        ArrayList<Integer> arrList = new ArrayList<>();

        // add object
        arrList.add(10);
        arrList.add(20);
        arrList.add(20);
        arrList.add(20);
        arrList.add(30);
        arrList.add(40);

        System.out.println(arrList);
        arrList.remove(3);             // it's easy to remove element from an ArrayList
        System.out.println(arrList);

        // ArrayList
        // Duplicate objects are allowed
        // Insertion order preserved



    }

}
