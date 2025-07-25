class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i : arr){
            hash.put(i, hash.getOrDefault(i, 0)+1);
        }
        int lucky = -1;
        for(int key : hash.keySet()){
            if(key == hash.get(key)){
                lucky = Math.max(lucky, key);
            }
        }
        return lucky;
    }
}