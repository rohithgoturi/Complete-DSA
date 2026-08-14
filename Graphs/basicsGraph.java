import java.util.ArrayList;

public class basicsGraph {
    static class Edges{
        int src;
        int dest;
        int wt;

        public Edges(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edges> [] graph = new ArrayList[V];
        
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // vertex 0
        graph[0].add(new Edges(0,1,5));

        //vertex 1
        graph[1].add(new Edges(1,2,1));
        graph[1].add(new Edges(1,3,2));
        graph[1].add(new Edges(1,0,5));

        //vertex 2
        graph[2].add(new Edges(2,1,1));
        graph[2].add(new Edges(2,3,1));
        graph[2].add(new Edges(2,4,2));

        //vertex 3
        graph[3].add(new Edges(3,2,1));
        graph[3].add(new Edges(3,1,3));

        //vertex 4
        graph[4].add(new Edges(4,2,2));

    }
}
