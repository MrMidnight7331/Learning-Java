// Advanced Rock Paper Scissors
// By: MrMidnight

import java.util.Random;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        while (true) {
            String[] buttons = { "Scissors", "Paper", "Rock" };

            int playerMove = JOptionPane.showOptionDialog(null, "Rock, Paper or Scissors?:", "Advanced Rock, Paper, Scissors", JOptionPane.INFORMATION_MESSAGE, 1, null, buttons, buttons);

            if (playerMove == -1) {
                System.exit(0);
            }

            Random randomnum = new Random();
            int computerMove = randomnum.nextInt(3);

            String playerChoice = buttons[playerMove];
            String computerChoice = buttons[computerMove];

            if (playerChoice.equals(computerChoice)) {
                JOptionPane.showMessageDialog(null, "It's a draw!", "Computer chose: " + computerChoice, JOptionPane.INFORMATION_MESSAGE);
            } else if (
                (playerChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
                (playerChoice.equals("Paper") && computerChoice.equals("Rock")) ||
                (playerChoice.equals("Scissors") && computerChoice.equals("Paper"))
            ) {
                JOptionPane.showMessageDialog(
                    null,
                    "Player wins!",
                    "Computer chose: " + computerChoice,
                    JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(null, "Computer wins!", "Computer chose: " + computerChoice, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
