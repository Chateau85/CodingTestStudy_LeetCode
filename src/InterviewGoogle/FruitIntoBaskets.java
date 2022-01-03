package InterviewGoogle;

public class FruitIntoBaskets {
    public static void main(String[] args) {
        int[] fruits = {1, 2, 3, 2, 2};
        System.out.print(totalFruits(fruits));
    }

    private static int totalFruits(int[] fruits) {
        int lastFruit = -1;
        int secondLastFruit = -1;
        int lastFruitCount = 0;
        int currMax = 0;
        int max = 0;

        for (int fruit : fruits) {
            if (fruit == lastFruit || fruit == secondLastFruit) {
                currMax++;
            } else {
                currMax = lastFruitCount + 1; // last fruit + new fruit
            }

            if (fruit == lastFruit) {
                lastFruitCount++;
            } else {
                lastFruitCount = 1;
            }

            if (fruit != lastFruit) {
                secondLastFruit = lastFruit;
                lastFruit = fruit;
            }

            max = Math.max(max, currMax);
        }

        return max;
    }
}
