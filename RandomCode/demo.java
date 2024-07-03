package RandomCode;

class demo{
  public static void main (String args[]){
    int[] num = {0,1,2,2,3,0,4,2};
    int value = 2;

    int v = removeElement(num, value);
    System.out.println(v);
  }

  public static int removeElement(int[] nums, int val) {
    int count = 0;
    for(int i = 0; i < nums.length; i++){
      if(nums[i] == val) {
        nums[i] = nums[nums.length - 1];
        count++;
      }
    }

    for(int i = 0; i < nums.length; i++){
      System.out.print(nums[i]);
    }
    System.out.println("---");
    return count;
  }
}
