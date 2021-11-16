public class Array2 {
  public int countEvens(int[] nums) {
    int local = 0;
    for (int element : nums) {
      if (element % 2 == 0) {
        local += 1;
      }
    }
    return local;
  }
  public int bigDiff(int[] nums) {
    int max = 0;
    int min = 999;
    for (int element : nums) {
      max = Math.max(max, element);
      min = Math.min(min, element);
    }
    return max - min;
  }
  public int centeredAverage(int[] nums) {
    int max = 0;
    int min = 999;
    int sum = 0;
    for (int element : nums) {
      max = Math.max(max, element);
      min = Math.min(min, element);
      sum += element;
    }
    return (sum - (max + min))/(nums.length - 2);
  }
  public int sum13(int[] nums) {
    int sum = 0;
    for (int x ; x < nums.length ; x += 1) {
      if (nums[x] != 13 && )
    }
}
