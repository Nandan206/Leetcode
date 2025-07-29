class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sumofallelements = 0;
        int sumofuniqueelements = 0;
        for(int num : nums){
            if(!set.contains(num)){
                set.add(num);
                sumofuniqueelements += num;
            }
            sumofallelements += num;
        }
        return 2 * sumofuniqueelements - sumofallelements;
    }
}