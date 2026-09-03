class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int low=0;
        int maxcount=0;
        int maxlen=0;
        for(int high=0;high<s.length();high++){
            char ch=s.charAt(high);
            map.put(ch, map.getOrDefault(ch,0)+1);
            int len=high-low+1;
            int count=map.get(ch);
            maxcount=Math.max(maxcount, count);
            int diff=len-maxcount;
            while(diff>k){
                char leftchar=s.charAt(low);
                count=map.get(leftchar);
                count--;
                map.put(leftchar,count);
                low++;
                len=high-low+1;
                 diff=len-maxcount;
            }
            maxlen=Math.max(maxlen,len);
        }
        return maxlen;
    }
}
