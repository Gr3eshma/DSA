class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>  hash = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int opp=target-nums[i];
            if (hash.containsKey(opp)){
                return new int[] {hash.get(opp),i};
            }
            hash.put(nums[i], i);
        }
        return new int[]{};
    }
}