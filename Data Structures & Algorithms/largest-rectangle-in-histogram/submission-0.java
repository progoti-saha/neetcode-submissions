class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> s=new Stack<>();
        int res=0;
        for(int i=0;i<n;i++){
        while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
            int sq=s.pop();
            int area=heights[sq]*(s.isEmpty() ? i : (i-s.peek()-1));
            res=Math.max(res,area);
        }
        s.push(i);
        }
        while(!s.empty()){
             int sq=s.pop();
             int area=heights[sq]*(s.isEmpty() ? n : (n-s.peek()-1));
             res=Math.max(res,area);
        }
        return res;
    }
    }

