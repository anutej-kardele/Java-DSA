package Array;

import java.util.HashMap;

public class FrequencyOfCharacter {

    public static void main(String[] args){

        String str = "GeeksForGeeks";
        //String str = "I am Anutej, writing this to test frequency of charector in a string";

        //UsingHashMap(str);
        UsingASCII(str);
    }


    public static void UsingASCII(String str){

        // write logic using ascii
        String asc = "";
        char[] ch = str.toCharArray();

        // Loop to traverse string
        for (int x : ch) {

            // Append ASCII value of
            // current string to asc
            asc += Integer.toString((int)x);
        }

        // Stores frequency of digits
        int[] freq = new int[10];

        // Loop to traverse asc
        for(int i = 0; i < asc.length(); i++) {
            freq[asc.charAt(i) - '0']++;
        }

        // Print frequency of each digit
        for (int i = 0; i < 10; i++) {
            System.out.print(freq[i] + " ");
        }

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
