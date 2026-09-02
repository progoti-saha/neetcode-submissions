class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> required= new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
           required.put(ch,required.getOrDefault(ch,0)+1);

        }
        HashMap<Character,Integer> window = new HashMap<>();
        int low=0;
        int formed=0;
        int minlen=Integer.MAX_VALUE;
        int beststart=0;
        int requiredcount=required.size();

        for(int high=0;high<s.length();high++){
           char ch=s.charAt(high);
           window.put(ch, window.getOrDefault(ch,0)+1);

           if(required.containsKey(ch) && window.get(ch).intValue() == required.get(ch).intValue()){
            formed++;
           }
        
        while(formed==requiredcount){
            int len=high-low+1;
            if(minlen>len){
                minlen=len;
                beststart=low;
            }
            char leftchar=s.charAt(low);
            int count = window.get(leftchar);
count--;
window.put(leftchar, count);
            if(required.containsKey(leftchar) && count<required.get(leftchar)){
                formed--;
            }
            low++;
        }
    }
    if (minlen == Integer.MAX_VALUE) {
            return "";
    }
    return s.substring(beststart, beststart+minlen);
    }
}
