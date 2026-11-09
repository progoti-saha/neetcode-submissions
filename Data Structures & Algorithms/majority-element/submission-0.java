class Solution {

    public int candidate(int[] nums){
        int res=0;
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
          if(nums[i] == nums[res]){
            count++;
          }
          else{
            count--;
          }
          if(count==0){
            res=i;
            count=1;
          }
        }
        return res;
    }
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=0;
        int c=candidate(nums);
        for(int i=0;i<n;i++){
            if(nums[i]==nums[c]){
                count++;
            }
        }
        if(count> n/2){
            return nums[c];
        }
        else
        return -1;
    }

}