import java.util.*;
public class largestHistogram {
    public int largestRectangleArea(int[] heights) {
        int[] lb=new int[heights.length];
        int[] rb=new int[heights.length];
        //   int[] res=new int[heights.length];
        lb[0]=-1;
        rb[rb.length-1]=rb.length;
        int x=0;

        Stack<Integer> s=new Stack<>();
        s.push(rb.length-1);
        rb[rb.length-1]=rb.length;

        for(int i=rb.length-2;i>=0;i--){
            while(s.size()>0 && heights[i]<=heights[s.peek()]){
                s.pop();
            }
            if(s.size()==0){
                rb[i]=rb.length;
            }
            else{
                rb[i]=s.peek();
            }
            s.push(i);
        }

        s=new Stack<>();
        s.push(0);
        lb[0]=-1;
        for(int i=1;i<lb.length;i++){
            while(s.size()>0 && heights[i]<=heights[s.peek()]){
                s.pop();
            }
            if(s.size()==0){
                lb[i]=-1;
            }
            else{
                lb[i]=s.peek();
            }
            s.push(i);
        }

        int max=Integer.MIN_VALUE;
        int area=0;
        for(int i=0;i<lb.length;i++){
            area=((rb[i]-lb[i]-1)*heights[i]);
            if(area>max){
                max=area;
            }
        }
        return max;
    }
}