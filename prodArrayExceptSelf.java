/*

Product of Array Except Self

Given an integer array nums, return an array answer such that 
answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation

*/

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int res[] = new int[nums.length];

        if(nums.length == 2) {
            res[0] = nums[1];
            res[1] = nums[0];

            return res;

        }
        
        for(int i = 0; i < nums.length; i++) {
            final int currIdx = i;
            // res[i] = Arrays.stream(nums).filter($ -> !($ == currNum)).reduce((a,b) -> a * b).orElse(0);
            res[i] = IntStream.range(0, nums.length)
                        // .parallel()
                        .filter($ -> !($ == currIdx))
                        .mapToObj($ -> nums[$])
                        .reduce((a,b) -> a * b)
                        .orElse(0);
        }

        return res;

    }
}