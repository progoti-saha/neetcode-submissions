class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
         HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            int l=target-nums[i];
            if(h.containsKey(l)){
                return new int[]{h.get(l), i};
            }
            h.put(nums[i], i);
        }
        return new int[]{};
    }
}
