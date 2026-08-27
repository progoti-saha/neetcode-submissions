class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int low=0;
        int high=n-1;
        int maxwater=0;
        while(low<high){
            int w=Math.abs(high-low);
            int minheight=Math.min(heights[low],heights[high]);
            int water=w*minheight;
            maxwater=Math.max(maxwater,water);
            if(heights[low]<heights[high]){
                low++;
            }
            else if(heights[low]>heights[high]){
                high--;
            }
            else{
                low++;
                high--;
            }
        }
        return maxwater;
    }
}
