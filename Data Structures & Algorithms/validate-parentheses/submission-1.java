class Solution {
    boolean isMatching(char x,char y){
       if((x=='(' && y==')') || 
       (x=='{' && y=='}') || 
       (x=='[' && y==']')) {
        return true;
       }
       return false;
       }

    public boolean isValid(String s) {
        Stack<Character> myStack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{'|| s.charAt(i)=='['){
                myStack.push(s.charAt(i));
            }
            else{
            if(myStack.isEmpty() == true)
            {
               return false;
            }
            else if(isMatching(myStack.peek(),s.charAt(i))==false)
            return false; 
            else{
                myStack.pop();
            } 
        }
        }  
        if(myStack.isEmpty()==true)
        return true;  
        else 
        return false;  
    }
}
