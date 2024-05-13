import java.util.Random;

public class Lottery {
    private int[] nums;

    // Constructor to initialize the array with numbers 0-48
    public Lottery() {
        nums = new int[49];
        for (int i = 0; i < 49; i++) {
            nums[i] = i + 1;
        }
    }

    // Method to randomly draw 6 numbers
    public void draw() {
        Random rand = new Random();
        int[] selectedNumbers = new int[6];
        boolean[] alreadySelected = new boolean[50]; 

        for (int i = 0; i < 6; i++) {
            int randomNumber;

            while (true) {
                randomNumber = rand.nextInt(49) + 1; // Generate a random number between 1 and 49
                if (!alreadySelected[randomNumber]) {
                    break;
                }
            }

            selectedNumbers[i] = randomNumber;
            alreadySelected[randomNumber] = true;
        }
        System.out.print("The lucky numbers are: ");

        // Print out the selected numbers
        for (int j = 0; j < 6; j++) {
            System.out.print(selectedNumbers[j] + " ");
        }
    }
}
