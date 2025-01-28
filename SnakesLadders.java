import java.util.*;

public class SnakesLadders {
    private Map<Integer, Integer> positionsMap;
    private List<Integer> diceThrows;
    private int targetPosition;
    private int totalTransitions;

    public SnakesLadders(int numTransitions) {
        totalTransitions = numTransitions;
        positionsMap = new HashMap<>();
    }

    public void addConnection(int start, int end) {
        positionsMap.put(start, end);
    }

    public void setDiceThrows(List<Integer> throwsList) {
        diceThrows = throwsList;
    }

    public void setTargetPosition(int position) {
        targetPosition = position;
    }

    public boolean isWithinBounds(int position) {
        return position >= 1 && position <= 100;
    }

    public int moveToNewPosition(int current, int diceValue, Map<Integer, Integer> activeMap) {
        int nextPosition = current + diceValue;
        if (!isWithinBounds(nextPosition)) return current;

        while (activeMap.containsKey(nextPosition)) {
            nextPosition = activeMap.get(nextPosition);
        }
        return nextPosition;
    }

    public boolean canReachTarget(Map<Integer, Integer> activeMap) {
        int position = 1;
        for (int roll : diceThrows) {
            position = moveToNewPosition(position, roll, activeMap);
        }
        return position == targetPosition;
    }

    public void findSolutionPath() {
        if (positionsMap.containsKey(targetPosition)) {
            System.out.print("Not reachable");
            return;
        }

        if (canReachTarget(positionsMap)) {
            System.out.print("Not affected");
            return;
        }

        for (Map.Entry<Integer, Integer> entry : positionsMap.entrySet()) {
            int start = entry.getKey();
            int end = entry.getValue();

            Map<Integer, Integer> modifiedMap = new HashMap<>(positionsMap);
            modifiedMap.remove(start);
            modifiedMap.put(end, start);

            if (canReachTarget(modifiedMap)) {
                if (start > end) {
                    System.out.print("Ladder " + end + " " + start);
                } else {
                    System.out.print("Ladder " + start + " " + end);
                }
                return;
            }
        }

        System.out.print("Not reachable");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTransitions = scanner.nextInt();

        SnakesLadders game = new SnakesLadders(numTransitions);

        for (int i = 0; i < numTransitions; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            game.addConnection(start, end);
        }

        scanner.nextLine();
        String diceInput = scanner.nextLine();
        List<Integer> diceRolls = new ArrayList<>();
        for (String roll : diceInput.split(" ")) {
            diceRolls.add(Integer.parseInt(roll));
        }
        game.setDiceThrows(diceRolls);

        int finalPosition = scanner.nextInt();
        game.setTargetPosition(finalPosition);

        game.findSolutionPath();
    }
}
