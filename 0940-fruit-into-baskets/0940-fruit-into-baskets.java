class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int maxfruits = 0;
        int left = 0;
        Map <Integer, Integer> basket = new HashMap<>();

        for(int right=0;right<n;right++){
            int fruit = fruits[right];
            basket.put(fruit, basket.getOrDefault(fruit, 0)+1);

            while(basket.size() > 2) {
                int leftfruit = fruits[left];
                basket.put(leftfruit, basket.get(leftfruit) -1);
                if(basket.get(leftfruit) == 0){
                    basket.remove(leftfruit);
                }
                left++;
            }
            maxfruits = Math.max(maxfruits, right - left + 1);
        }
        return maxfruits;
    }
}