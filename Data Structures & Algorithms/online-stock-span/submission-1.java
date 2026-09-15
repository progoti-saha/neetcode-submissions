class StockSpanner{
    Stack<Integer> s;
    ArrayList<Integer> arr;
    int i;

    public StockSpanner(){
      s=new Stack<>();
      arr=new ArrayList<>();
      i=0;
    }

    int next(int price){
        arr.add(price);
        while(!s.isEmpty() && arr.get(s.peek())<=price){
            s.pop();
        }

        int span= s.isEmpty() ? i+1 : i-s.peek();
        s.push(i);
        i++;
        return span;
    }
}
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */