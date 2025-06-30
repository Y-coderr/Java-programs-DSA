import java.util.ArrayList;

public class DFSinGraph {

     static class Edge{

        int src;
        int dest;
        int wt;

        Edge(int s , int d,int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    //Depth first search :- it uses a recursive approch for it
    public static void dfs(ArrayList<Edge>[]graph,int curr,boolean[]vis){
        System.out.println(curr+" ");
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
              dfs(graph,e.dest,vis);
           }
        }
        
    }

    public static void main(String[] args) {
        int v=5;
        // firstly create a array of arraylist 
        ArrayList<Edge> [] graph = new ArrayList[v];

        for(int i=0;i<v;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 5));
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 4));
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));
        graph[4].add(new Edge(4, 2, 2));

        //2s neighbour 
        for(int i=0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dest);
        }

        dfs(graph, 0, new boolean[v]);

    }
    
    
}
