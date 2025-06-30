import java.util.ArrayList;

public class CycleDetectionInGraph {

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

    public static boolean detectCycle(ArrayList<Edge>[]graph){
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(detectCycleUtil(graph,vis,i,-1)){
                    return true;
                }
            }
        }
        return false;
    }

    // utility funtion for detect cycle 
    public static boolean detectCycleUtil(ArrayList<Edge>[]graph,boolean vis[],int curr , int par ){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            // case 3
            if(!vis[e.dest] && detectCycleUtil(graph, vis, e.dest, curr)){
                return true;
            }
            //case 1
            else if(vis[e.dest] && e.dest!=par){
                return true;
            }
            // case 2 : eat five star do nothing
        }
        return false;
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

    }
    
}
