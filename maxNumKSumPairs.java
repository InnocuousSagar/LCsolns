class Solution {
    public int maxOperations(int[] nums, int k) {

     Arrays.sort(nums);
 
        int result = 0;
 
        int start = 0, end = nums.length - 1;
 
        while (start < end) {
 
            if (nums[start] + nums[end] > k)
 
                end--;
 
            else if (nums[start] + nums[end] < k)
 
                start++;
 
            else {

                start++;
                end--;
                result++;

            }
        }
 
        return result;

        }
    
}