import java.util.*;

public class CR {
    static class Node {
        int x, y, resistance;

        Node(int x, int y, int resistance) {
            this.x = x;
            this.y = y;
            this.resistance = resistance;
        }
    }

    public static double calculateResistance(int N, char[][] matrix) {
        int[] start = new int[2], end = new int[2];
        boolean foundStart = false;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] == '.') {
                    if (!foundStart) {
                        start[0] = i;
                        start[1] = j;
                        foundStart = true;
                    } else {
                        end[0] = i;
                        end[1] = j;
                    }
                }
            }
        }


        Queue<Node> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        List<Integer> resistances = new ArrayList<>();

        queue.offer(new Node(start[0], start[1], 0));
        visited.add(start[0] + "," + start[1]);

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; 

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.x == end[0] && current.y == end[1]) {
                resistances.add(current.resistance);
                continue;
            }

            for (int[] dir : directions) {
                int nx = current.x + dir[0];
                int ny = current.y + dir[1];
                int newResistance = current.resistance;


                if (nx >= 0 && nx < N && ny >= 0 && ny < N && !visited.contains(nx + "," + ny)) {
                    char cell = matrix[nx][ny];

                    if (cell == '|' || cell == '-' || cell == '+') {
                        newResistance += 1;
                        queue.offer(new Node(nx, ny, newResistance));
                        visited.add(nx + "," + ny);
                    }
                }
            }
        }

        // Combine resistances in parallel
        if (resistances.isEmpty()) {
            return -1; // No valid path
        }

        double reciprocalSum = 0.0;
        for (int resistance : resistances) {
            reciprocalSum += 1.0 / resistance;
        }

        return 1.0 / reciprocalSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix size
        System.out.print("Enter the size of the matrix (N): ");
        int N = sc.nextInt();
        sc.nextLine(); // Consume the newline

        // Input circuit matrix
        char[][] matrix = new char[N][N];
        System.out.println("Enter the matrix row by row:");
        for (int i = 0; i < N; i++) {
            String row = sc.nextLine();
            matrix[i] = row.toCharArray();
        }

        // Calculate resistance
        double resistance = calculateResistance(N, matrix);

        // Output result
        if (resistance == -1) {
            System.out.println("No valid path found.");
        } else {
            System.out.printf("Total resistance of the circuit: %.0f\n", resistance);
        }
    }
}
