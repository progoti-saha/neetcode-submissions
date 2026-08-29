class Solution {
    public int lengthOfLongestSubstring(String s) {
        int prev[]=new int[256];
        int n=s.length();
        Arrays.fill(prev,-1);
        int res=0;
        int i=0;
        for(int j=0;j<n;j++){
            i=Math.max(i,prev[s.charAt(j)]+1);
            int maxlen=j-i+1;
            res=Math.max(res,maxlen);
            prev[s.charAt(j)]=j;
        }
        return res;
    }
}
