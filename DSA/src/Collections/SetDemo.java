package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args){

        // Set
        // Duplicates are not allowed in Sets
        // Insertion order is not preserved in Sets
        // Need to use Iterator to get value from set
        // Iterator works on address concept it will check for next address available if so you can get the next value

        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(10);
        setInteger.add(20);
        setInteger.add(20);
        setInteger.add(10);
        setInteger.add(30);
        setInteger.add(50);
        setInteger.add(30);
        setInteger.add(250);

        System.out.println(setInteger);

        // Get value from set
        System.out.println("\nFor loop method");

        for (Integer integer : setInteger) {
            System.out.print(integer + " ");
        }

        System.out.println("\nIterator method");

        Iterator<Integer> iterator = setInteger.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }
}
