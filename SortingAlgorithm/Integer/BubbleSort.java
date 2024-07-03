// this algorithm checks 2 consecutive numbers and arranges them as required

class BubbleSort{
   public static void main(String[] args){

      int[] list = {4, 6, 1, 8, 5, 9, 0, 7, 2, 3};

      list = AssendingSort(list);
      for(int in: list) System.out.print(in + " ");

      System.out.println();

      list = DecendingSort(list);
      for(int in: list) System.out.print(in + " ");
   }

   static int[] AssendingSort(int[] val){
      int[] intArray = val;
      int temp = 0;

      for(int i = 0; i < intArray.length - 1; i++){
         for(int j = 0; j < intArray.length - i - 1; j++){
            if(intArray[j] > intArray[j + 1]){
               temp = intArray[j];
               intArray[j] = intArray[j+1];
               intArray[j+1] = temp;
            }
         }
      }
      return intArray;
   }

   static int[] DecendingSort(int[] val){
      int[] intArray = val;
      int temp = 0;

      for(int i = 0; i < intArray.length; i++){
         for(int j = intArray.length - 1; j > 0; j--){
            if(intArray[j] > intArray[j - 1]){
               temp = intArray[j];
               intArray[j] = intArray[j-1];
               intArray[j-1] = temp;
            }
         }
      }
      return intArray;
   }
}
