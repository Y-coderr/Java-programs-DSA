import java.util.ArrayList;

public class FindAllPathsFromSourceToTarget {

    static class Edge {

        int src;
        int dest;
       

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void printAllPaths(ArrayList<Edge> graph[], int src, int dest, String path) {
        if (src == dest) {
            System.out.println(path + dest);
            return;
        }

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            printAllPaths(graph, e.dest, dest, path + src);
        }
    }

    public static void main(String[] args) {
        int v = 5;
        // firstly create a array of arraylist
        ArrayList<Edge>[] graph = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 3));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

        printAllPaths(graph, 5, 1, "");

    }

}
