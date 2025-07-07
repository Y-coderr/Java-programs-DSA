import java.util.*;

public class TopologicalSortBFS {

    static class Edge {

        int src;
        int dest;
        //int wt;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
            //this.wt = w;
        }
    }

    public static void calcIndeg(ArrayList<Edge> graph[], int indeg[]) {
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                indeg[e.dest]++;
            }
        }
    }

    public static void topSort(ArrayList<Edge> graph[]) {
        int indeg[] = new int[graph.length];
        calcIndeg(graph, indeg);
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < indeg.length; i++) {
            if (indeg[i] == 0) {
                q.add(i);
            }
        }

        // clasic bfs
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.println(curr);
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                if (indeg[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        int v = 5;
        // firstly create a array of arraylist
        ArrayList<Edge>[] graph = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));

        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));

        graph[5].add(new Edge(5, 2));

    }
}
