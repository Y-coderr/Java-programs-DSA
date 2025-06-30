import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSorting {
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

    public static void topSort(ArrayList<Edge>[]graph){
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                topSortUtil(graph,i ,vis, s);
            }
        }
        while(!s.isEmpty()){
            System.out.println(s.pop()+" ");
        }
    }

    public static void topSortUtil(ArrayList<Edge>[] graph,int curr , boolean vis[],Stack<Integer>s){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.dest]){
               topSortUtil(graph, e.dest, vis, s);
            }
        }

        s.push(curr);

    }

    public static void main(String[] args) {
        int v=5;
        // firstly create a array of arraylist 
        ArrayList<Edge> [] graph = new ArrayList[v];

        for(int i=0;i<v;i++){
            graph[i] = new ArrayList<>();
        }

        
    }
}
