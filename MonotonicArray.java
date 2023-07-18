// Question 7
// An array is monotonic if it is either monotone increasing or monotone decreasing.

// An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is
// monotone decreasing if for all i <= j, nums[i] >= nums[j].

// Given an integer array nums, return true if the given array is monotonic, or false otherwise.

// Example 1:
// Input: nums = [1,2,2,3]
// Output: true

public class MonotonicArray {
    public static boolean isMonotonic(int[] nums) {
        if (nums.length <= 1){
           return true;
       }
       int A = 0;
       int B = 0;
       for(int i=0;i<nums.length-1;i++){
           if(nums[i]<=nums[i+1]){
               A++;
           }
           if(nums[i+1]<=nums[i]){
               B++;
           }
       }
       if(A==nums.length-1){
           return true;
       }
       else if(B==nums.length-1){
           return true;
       }
       return false; 
   }
   public static void main(String[] args) {
    int[] nums = {1,2,2,3};
    System.out.println(isMonotonic(nums));
   }
}
