import java.util.*;

public class MoveSofa {
    public static int minStepsToMoveSofa(String[][] matrix, int M, int N) {
        List<int[]> startPositions = new ArrayList<>();
        List<int[]> endPositions = new ArrayList<>();

      
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j].equals("s")) {
                    startPositions.add(new int[]{i, j});
                } else if (matrix[i][j].equals("S")) {
                    endPositions.add(new int[]{i, j});
                }
            }
        }

       
        if (startPositions.size() != 2 || endPositions.size() != 2) return -1;

        Queue<int[][]> queue = new LinkedList<>();
        Queue<Integer> stepsQueue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        int[][] start = {startPositions.get(0), startPositions.get(1)};
        queue.offer(start);
        stepsQueue.offer(0);
        visited.add(serialize(start));

        
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; 

        while (!queue.isEmpty()) {
            int[][] current = queue.poll();
            int steps = stepsQueue.poll();

            if (isTarget(current, endPositions)) return steps;

            for (int[] dir : directions) {
                int[][] newPositions = move(current, dir);
                if (isValid(newPositions, matrix, M, N) && visited.add(serialize(newPositions))) {
                    queue.offer(newPositions);
                    stepsQueue.offer(steps + 1);
                }
            }

          
            int[][] rotatedPositions = rotate(current, matrix, M, N);
            if (rotatedPositions != null && visited.add(serialize(rotatedPositions))) {
                queue.offer(rotatedPositions);
                stepsQueue.offer(steps );
            }
        }

        return -1; 
    }

    private static boolean isTarget(int[][] positions, List<int[]> endPositions) {
        return Arrays.deepEquals(positions, new int[][]{endPositions.get(0), endPositions.get(1)}) ||
               Arrays.deepEquals(positions, new int[][]{endPositions.get(1), endPositions.get(0)});
    }

    private static int[][] move(int[][] positions, int[] direction) {
        return new int[][]{
            {positions[0][0] + direction[0], positions[0][1] + direction[1]},
            {positions[1][0] + direction[0], positions[1][1] + direction[1]}
        };
    }

    private static boolean isValid(int[][] positions, String[][] matrix, int M, int N) {
        for (int[] pos : positions) {
            int x = pos[0], y = pos[1];
            if (x < 0 || x >= M || y < 0 || y >= N || matrix[x][y].equals("H")) {
                return false;
            }
        }
        return true;
    }

    private static int[][] rotate(int[][] positions, String[][] matrix, int M, int N) {
        int x = positions[0][0];
        int y = positions[0][1];

        int[][] newPositions = (positions[0][1] == positions[1][1]) ? 
                new int[][]{{x, y}, {x, y + 1}} :
                new int[][]{{x, y}, {x + 1, y}};

        return isValid(newPositions, matrix, M, N) ? newPositions : null;
    }

    private static String serialize(int[][] positions) {
        return Arrays.deepToString(positions);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows (M): ");
        int M = sc.nextInt();
        System.out.print("Enter columns (N): ");
        int N = sc.nextInt();

        System.out.println("Now enter the matrix elements (row by row):");
        sc.nextLine();

        String[][] matrix = new String[M][N];
        for (int i = 0; i < M; i++) {
            matrix[i] = sc.nextLine().split(" ");
        }

        int result = minStepsToMoveSofa(matrix, M, N);
        System.out.println(result == -1 ? "Impossible" : result+1);
    }
}
