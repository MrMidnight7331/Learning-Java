import java.util.Random;

public class Lottery {
    private int[] numbers;

    public Lottery() {
        numbers = new int[49];
        for (int i = 0; i < 49; i++) {
            numbers[i] = i + 1;
        }
    }

    public void getNum() {
        Random random = new Random();
        int[] result = new int[6];

        for (int i = 0; i < 6; i++) {
            result[i] = numbers[random.nextInt(49)];
        }

        // Check for duplicates and re-roll if necessary
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                if (result[i] == result[j]) {
                    result[i] = numbers[random.nextInt(49)];
                    i--; // re-roll the current number
                    break;
                }
            }
        }
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}