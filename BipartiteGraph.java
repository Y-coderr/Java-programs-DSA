import java.util.*;
public class BipartiteGraph {

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

    public static boolean isBiPartite(ArrayList<Edge>[]graph){
        int col[] = new int[graph.length];
        for(int i=0;i<col.length;i++){
            col[i]=-1;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(col[i]==-1){
                q.add(i);
                col[i]=0;
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j=0;j<graph[curr].size();j++){
                        Edge e= graph[curr].get(j);
                        if(col[e.dest]==-1){
                            int nextCol = col[curr] == 0?1:0;
                            col[e.dest]= nextCol;
                            q.add(e.dest);

                        }else if(col[e.dest]==col[curr]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
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


       System.out.println( isBiPartite(graph));

    }
    
}
