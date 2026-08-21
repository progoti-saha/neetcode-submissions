class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> m=new HashSet<>();
        for(int i=0;i<nums.length;i++){
           m.add(nums[i]);
        }
        if(m.size()<nums.length){
            return true;
        }
        return false;
    }
}