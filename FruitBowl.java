import java.util.*;
import java.lang.Math;

public class FruitBowl {
    static final double EPSILON = 1e-6;

    public static double distance(int x1, int y1, int x2, int y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static int crossProduct(int[] a, int[] b, int[] c) {
        return (b[0] - a[0]) * (c[1] - a[1]) - (b[1] - a[1]) * (c[0] - a[0]);
    }

    public static boolean isColinear(int[] a, int[] b, int[] c) {
        return Math.abs(crossProduct(a, b, c)) < EPSILON;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        try {
            N = sc.nextInt();
            if (N <= 4 || N >= 50) {
                throw new IllegalArgumentException("Invalid number of dots (N must be between 4 and 50)");
            }
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException("Invalid input format (N must be an integer)");
        }

        int[][] points = new int[N][2];
        for (int i = 0; i < N; i++) {
            try {
                points[i][0] = sc.nextInt();
                points[i][1] = sc.nextInt();
            } catch (InputMismatchException e) {
                throw new IllegalArgumentException("Invalid input format (coordinates must be integers)");
            }
        }

        Arrays.sort(points, (a, b) -> (a[0] == b[0]) ? a[1] - b[1] : a[0] - b[0]);
        List<int[]> lowerHull = new ArrayList<>();
        for (int[] point : points) {
            while (lowerHull.size() >= 2 && 
                   (crossProduct(lowerHull.get(lowerHull.size() - 2), lowerHull.get(lowerHull.size() - 1), point) <= 0 
                    || (isColinear(lowerHull.get(lowerHull.size() - 2), lowerHull.get(lowerHull.size() - 1), point) 
                        && !isLeftOnLine(lowerHull.get(lowerHull.size() - 2), lowerHull.get(lowerHull.size() - 1), point)))) {
                lowerHull.remove(lowerHull.size() - 1);
            }
            lowerHull.add(point);
        }

        if (lowerHull.size() < 3) {
            System.out.println(0);
            return;
        }

        double perimeter = 0.0;
        for (int i = 0; i < lowerHull.size() - 1; i++) {
            perimeter += distance(lowerHull.get(i)[0], lowerHull.get(i)[1], lowerHull.get(i + 1)[0], lowerHull.get(i + 1)[1]);
        }

        System.out.print((int) Math.round(perimeter));
    }

    
    private static boolean isLeftOnLine(int[] a, int[] b, int[] c) {
        return (b[0] - a[0]) * (c[1] - a[1]) - (b[1] - a[1]) * (c[0] - a[0]) >= 0; 
    }
}