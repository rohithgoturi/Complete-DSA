import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class checkPathExists {
    public static boolean checkPath(int V, int[][] edges, int src, int dest) {
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i = 0; i<V; i++){
            List<Integer> arr = new ArrayList<>();
            list.add(arr);
        }
        
        for(int i=0; i<edges.length; i++){
            int a = edges[i][0];
            int b = edges[i][1];
            
            list.get(a).add(b);
            list.get(b).add(a);
        }
        
        boolean[] vis = new boolean[V];
        
        bfs(src,list,vis);
        
        return vis[dest];
    }
    
    public static void bfs(int src, List<List<Integer>> list, boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        vis[src] = true;
        
        while(!q.isEmpty()){
            int front = q.remove();
            
            for(int ele : list.get(front)){
                if(vis[ele] == false){
                    q.add(ele);
                    vis[ele] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {{0,1},{1,2},{1,3},{2,3},{2,4}};
        int src = 0;
        int dest = 4;

        boolean pathExists = checkPath(V, edges, src, dest);
        System.out.println("Path exists from " + src + " to " + dest + ": " + pathExists);
    }
}
