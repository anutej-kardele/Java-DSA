package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args){

        // Map
        // Map will store value in Key & Value format i.e. every key will have its value
        // in Maps a key could not be duplicate

        Map<String, Integer> map = new HashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);


        System.out.println(map);

    }
}
