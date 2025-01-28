import java.util.*;

public class FriendshipBands {

    // Helper method to move the position based on the direction
    private static int[] movePosition(int x, int y, int z, char direction) {
        switch (direction) {
            case 'u': return new int[]{x, y - 1, z}; // up
            case 'd': return new int[]{x, y + 1, z}; // down
            case 'f': return new int[]{x, y, z + 1}; // front
            case 'b': return new int[]{x, y, z - 1}; // back
            case 'l': return new int[]{x - 1, y, z}; // left
            case 'r': return new int[]{x + 1, y, z}; // right
            default: return new int[]{x, y, z};
        }
    }

    // Helper method to check if two sets have no common elements
    private static boolean isDisjoint(Set<String> set1, Set<String> set2) {
        for (String pos1 : set1) {
            if (set2.contains(pos1)) {
                return false; // Overlap found
            }
        }
        return true; // No overlap found
    }

    // Helper method to determine if cell1 is "above" cell2 in 3D
    private static boolean isAbove(int[] cell1, int[] cell2) {
        if (cell1[2] > cell2[2]) {
            return true;
        } else if (cell1[2] == cell2[2]) {
            if (cell1[1] > cell2[1]) {
                return true;
            } else if (cell1[1] == cell2[1]) {
                return cell1[0] > cell2[0];
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Read the input
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt(); // size of the cube matrix

        int[] band1Start = {sc.nextInt(), sc.nextInt(), sc.nextInt()}; // Band 1 start position
        String band1Movements = sc.next(); // Movement sequence for Band 1

        int[] band2Start = {sc.nextInt(), sc.nextInt(), sc.nextInt()}; // Band 2 start position
        String band2Movements = sc.next(); // Movement sequence for Band 2

        // Step 1: Track positions of both bands in 3D space
        Set<String> band1Positions = new HashSet<>();
        Set<String> band2Positions = new HashSet<>();

        // Add the starting position of Band 1 to its set
        int x1 = band1Start[0], y1 = band1Start[1], z1 = band1Start[2];
        band1Positions.add(x1 + "," + y1 + "," + z1);

        // Simulate Band 1's movements
        for (char move : band1Movements.toCharArray()) {
            int[] newPos = movePosition(x1, y1, z1, move);
            x1 = newPos[0];
            y1 = newPos[1];
            z1 = newPos[2];
            band1Positions.add(x1 + "," + y1 + "," + z1);
        }

        // Add the starting position of Band 2 to its set
        int x2 = band2Start[0], y2 = band2Start[1], z2 = band2Start[2];
        band2Positions.add(x2 + "," + y2 + "," + z2);

        // Simulate Band 2's movements
        for (char move : band2Movements.toCharArray()) {
            int[] newPos = movePosition(x2, y2, z2, move);
            x2 = newPos[0];
            y2 = newPos[1];
            z2 = newPos[2];
            band2Positions.add(x2 + "," + y2 + "," + z2);
        }

        // Step 2: Check for overlap between the two bands
        if (!isDisjoint(band1Positions, band2Positions)) {
            System.out.print("Impossible");
            return;
        }

        // Step 3: Calculate the maximum number of cells one band is above the other
        int maxAbove = 0;

        // Count how many cells of Band 2 are below each cell of Band 1
        for (String pos1 : band1Positions) {
            String[] parts1 = pos1.split(",");
            int[] cell1 = {Integer.parseInt(parts1[0]), Integer.parseInt(parts1[1]), Integer.parseInt(parts1[2])};

            int count = 0;
            for (String pos2 : band2Positions) {
                String[] parts2 = pos2.split(",");
                int[] cell2 = {Integer.parseInt(parts2[0]), Integer.parseInt(parts2[1]), Integer.parseInt(parts2[2])};
                if (isAbove(cell1, cell2)) {
                    count++;
                }
            }
            maxAbove = Math.max(maxAbove, count);
        }

        // Count how many cells of Band 1 are below each cell of Band 2
        for (String pos2 : band2Positions) {
            String[] parts2 = pos2.split(",");
            int[] cell2 = {Integer.parseInt(parts2[0]), Integer.parseInt(parts2[1]), Integer.parseInt(parts2[2])};

            int count = 0;
            for (String pos1 : band1Positions) {
                String[] parts1 = pos1.split(",");
                int[] cell1 = {Integer.parseInt(parts1[0]), Integer.parseInt(parts1[1]), Integer.parseInt(parts1[2])};
                if (isAbove(cell2, cell1)) {
                    count++;
                }
            }
            maxAbove = Math.max(maxAbove, count);
        }

        // Step 4: Output the result
        System.out.print(maxAbove);
    }
}