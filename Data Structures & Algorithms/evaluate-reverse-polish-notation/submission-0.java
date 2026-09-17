class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        int n=tokens.length;
        for(int i=0;i<n;i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                int op1=s.pop();
                int op2=s.pop();
                
                int ans=0;
                if(tokens[i].equals("+")){
                    ans=op2+op1;
                }
                if(tokens[i].equals("-")){
                    ans=op2-op1;
                }
                if(tokens[i].equals("*")){
                    ans=op2*op1;
                }
                if(tokens[i].equals("/")){
                    ans=op2/op1;
                }
                s.push(ans);
            }
            else
            s.push(Integer.parseInt(tokens[i]));
        }
        return s.peek();
    }
}
