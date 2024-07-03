// To do
// from a string and a variable k amount - make a list of all combination of possible arrangement from k amount of variables
// From a list of strings arrange them in a Lexicographical Order, alphabetically and all capital first

// How to do
// seperate 2 arrays for capital and small case alphabet and then array both arrays alphabetically
// them combine them and get the result required for the question

// Time Complexity

// Space Complexity

import java.util.ArrayList;

class SubstringComparison{
   public static void main(String[] args){
      String display = Arrange("welcometojava",3);
      System.out.println(display);
   }
   public static String Arrange(String s, int k){
      String largest = "";
      String smallest = "";

      // creating the list
      int totalNumber = s.length() + 1 - k;
      String[] list = new String[totalNumber];
      for(int i = 0; i < totalNumber; i++){
         list[i] = s.substring(i, i+k);
      }

      ArrayList<String> upperCase = new ArrayList<String>();
      ArrayList<String> lowerCase = new ArrayList<String>();

      for(int i = 0; i < totalNumber; i++){
         if(Character.isUpperCase(list[i].codePointAt(0))){
            upperCase.add(list[i]);
         }
         else{
            lowerCase.add(list[i]);
         }
      }

      // for(int i = 0; i < lowerCase.length; i++){
      //    for(int j = 0; j < lowerCase.length; i++){
            
      //    }
      // }



      for(String cha: list) {
            System.out.print(cha + " ");
      }
      System.out.println(" ");
      for(String cha: upperCase) {
            System.out.print(cha + " ");
      }
      System.out.println(" ");
      for(String cha: lowerCase) {
            System.out.print(cha + " ");
      }
      System.out.println(" ");

      return smallest + "\n" + largest;
   }
}
