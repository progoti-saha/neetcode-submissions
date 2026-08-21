class Solution {
    static final int CHAR=256;
    public boolean isAnagram(String s, String t) {
    int count[]=new int[256];
    if(s.length()!=t.length()){
        return false;
    }
    for(int i=0;i<s.length();i++){
        count[s.charAt(i)]++;
        count[t.charAt(i)]--;
    }
    for(int i=0;i<CHAR;i++){
        if(count[i]!=0){
            return false;
        }
    }
    return true;
    }
}
