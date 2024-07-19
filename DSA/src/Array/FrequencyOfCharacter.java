package Array;

import java.util.HashMap;

public class FrequencyOfCharacter {

    public static void main(String[] args){

        String str = "I am Anutej, writing this to test frequency of charector in a string";

        UsingHashMap(str);
    }

    public static void UsingHashMap(String str){

        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

        //str = str.toLowerCase();
        str = str.replace(" ", "");

        for(int i = 0; i < str.length(); i++){
            if(hashMap.containsKey(str.charAt(i))) hashMap.put(str.charAt(i), hashMap.get(str.charAt(i)) + 1);
            else hashMap.put(str.charAt(i), 1);
        }

        for (HashMap.Entry<Character, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
