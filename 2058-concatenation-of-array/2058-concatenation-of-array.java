class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        nums = Arrays.copyOf(nums, nums.length*2);
        for(int i=0;i<n;i++){
            nums[i + n] = nums[i];
        }
        return nums;
    }
}