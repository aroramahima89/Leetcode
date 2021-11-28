import java.util.*;
public class srcToTarget {
    List<List<Integer>> l=new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int start=0;
        int end=graph.length-1;
        Queue<List<Integer>> q=new LinkedList<>();
        q.add(Arrays.asList(start));
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                List<Integer> head=q.poll();
                if(head.get(head.size()-1)==end){
                    l.add(head);
                }
                int last=head.get(head.size()-1);
                for(int i=0;i<graph[last].length;i++){
                    List<Integer> list=new ArrayList<>(head);
                    list.add(graph[last][i]);
                    q.add(list);
                }
            }
        }
        return l;
    }
}