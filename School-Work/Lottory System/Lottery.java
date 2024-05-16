/**
 * @proejct Draw Lottory System
 * @author Tieno
 * @version 1.3
 **/
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Lottery {
    private int[] nums;

    // Initialize the array with numbers 0-48
    public Lottery() {
        nums = new int[49];
        for (int i = 0; i < 49; i++) {
            nums[i] = i + 1;
        }
    }

    // Randomly draw 6 numbers
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

        try {
        FileInputStream fis = new FileInputStream("logo.txt");
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(fis));

        // Read and print the file
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
        } 
        
        catch (FileNotFoundException e) {
            System.err.println("Error: File not found.");
            e.printStackTrace();
        } 
        catch (IOException e) {
            System.err.println("Error: Unable to read or close the file.");
            e.printStackTrace();
        }

        // Print out the selected numbers
        System.out.print("The lucky numbers are: ");
        for (int j = 0; j < 6; j++) {
            if (j < 5) {
                System.out.print(selectedNumbers[j] + ", ");
            } else {
                System.out.print(selectedNumbers[j]);
            }
        }
        System.out.println();

    }
}