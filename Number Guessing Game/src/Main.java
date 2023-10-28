// Number Guessing Game
// By: MrMidnight

import java.util.Random;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int player_num = 0;
        int attempts = 5;
        int difficulty = 0;
        int cp_num = 0;
        int diff = 0;

        String[] buttons = { "Hard", "Medium", "Easy" };

        difficulty = JOptionPane.showOptionDialog(null, "Choose difficulty:", "Number Guessing Game", JOptionPane.INFORMATION_MESSAGE, 1, null, buttons, buttons);

        // Hard difficulty
        if (difficulty == 0){
            cp_num = random.nextInt(100) + 1;
            diff = 100;

        // Medium difficulty
        } else if (difficulty == 1) {
            cp_num = random.nextInt(50) + 1;
            diff = 50;

        // Easy difficulty
        } else if (difficulty == 2) {
            cp_num = random.nextInt(20) + 1;
            diff = 20;

        // Exit
        }else {
            System.exit(0);
        }

        while (attempts > 0) {
            String player_input = JOptionPane.showInputDialog(null, "Enter your guess:", "I am thinking of a number between 0 - " + diff , JOptionPane.INFORMATION_MESSAGE);

            if (player_input == null) {
                System.exit(0);
            }

            try {
                player_num = Integer.parseInt(player_input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Input is not a number!", "Invalid Input!", JOptionPane.INFORMATION_MESSAGE);
                continue;
            }

            if (player_num < 1 || player_num > diff) {
                JOptionPane.showMessageDialog(null, "Input must be between 0 - " + diff, "Invalid Input!", JOptionPane.INFORMATION_MESSAGE);
                continue;
            }

            if (player_num == cp_num) {
                JOptionPane.showMessageDialog(null, "You won!", "Congratulations!", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);

            } else if (player_num > cp_num) {
                attempts--;
                JOptionPane.showMessageDialog(null, "The number is smaller than " + player_num, "Remaining attempts: " + attempts, JOptionPane.INFORMATION_MESSAGE);

            } else if (player_num < cp_num) {
                attempts--;
                JOptionPane.showMessageDialog(null, "The number is bigger than " + player_num, "Remaining attempts: " + attempts, JOptionPane.INFORMATION_MESSAGE);
            }
        }

        JOptionPane.showMessageDialog(null, "You ran out of attempts. The correct number was " + cp_num, "Game Over", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
