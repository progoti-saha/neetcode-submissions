class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxp=0;
        int minp=prices[0];
        for(int i=1;i<n;i++){
            maxp=Math.max(maxp,prices[i]-minp);
            minp=Math.min(minp,prices[i]);
        }
        return maxp;
    }
}
