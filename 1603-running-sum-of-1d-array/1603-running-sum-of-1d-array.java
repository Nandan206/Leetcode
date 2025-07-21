class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] ans = new int[nums.length];
        int index=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            ans[index++] = sum;
        }
        return ans;
    }
}