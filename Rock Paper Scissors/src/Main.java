// Rock Paper Scissors
// BY: MrMidnight
import java.util.Random;
import javax.swing.JOptionPane;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //input dialogue

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("rock|paper|scissors");
        String playermove = JOptionPane.showInputDialog(null,"Please choose: (R)ock|(P)aper|(S)cissors","Rock,Paper,Scissors!", JOptionPane.INFORMATION_MESSAGE);
        if (playermove == null) {
            System.exit(0);
        }

        // RNG
        Random random = new Random();
        int randomNum = random.nextInt(3);

        String computermoves;
        String computermove;

        if (randomNum == 0) {
            computermove = "rock";
            computermoves = "r";

        } else if (randomNum == 1) {
            computermove = "paper";
            computermoves = "p";
        }
        else {
            computermove = "scissors";
            computermoves = "s";
        }
        //turn all userinput to lowercase
        playermove = playermove.toLowerCase();

        /* debug
        System.out.println("player: " + playermove);
        System.out.println("computer: " + computermove);
        System.out.println("computers: " + computermoves);
        System.out.println("0 = rock, 1 = paper, 2 = scissors");
        System.out.println("random: " + randomNum);
        */

         while (!playermove.matches("rock") && !playermove.matches("paper") && !playermove.matches("scissors") && !playermove.matches("r") && !playermove.matches("p") && !playermove.matches("s"))
        {
            JOptionPane.showMessageDialog(null, "Invalid input!","Invalid input!",JOptionPane.INFORMATION_MESSAGE);
             playermove = JOptionPane.showInputDialog(null,"Please choose: (R)ock|(P)aper|(S)cissors","Rock,Paper,Scissors!", JOptionPane.INFORMATION_MESSAGE);
            if (playermove == null) {
                System.exit(0);
            }
        }

         // Who wins who looses
        if(playermove.equals(computermove) || playermove.matches(computermoves)) {
            JOptionPane.showMessageDialog(null,"It's a draw!","Computer chose: " +  computermove, JOptionPane.INFORMATION_MESSAGE);
            //System.out.println("Its a draw!");
        } else if (playerWins(playermove,computermove,computermoves)) {
            //System.out.println("Player wins!");
            JOptionPane.showMessageDialog(null,"Player wins!","Computer chose: " +  computermove, JOptionPane.INFORMATION_MESSAGE);
        } else {
            //System.out.println("Computer wins!");
            JOptionPane.showMessageDialog(null,"Computer wins!", "Computer chose: " + computermove, JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //boolean to determin who wins and who looses
    static boolean playerWins(String playermove, String computermove, String computermoves){

        // first letter of rock paper and scissors can be taken as input too
        if (playermove.equals("rock") || playermove.equals("r") || playermove.equals("R")){
            return computermove.equals("scissors") && computermoves.equals("s");

        } else if (playermove.equals("paper") || playermove.equals("p") || playermove.equals("P")) {
            return computermove.equals("rock") && computermoves.equals("r");

        } else if (playermove.equals("scissors") || playermove.equals("s") || playermove.equals("S")){
            return computermove.equals("paper") && computermoves.equals("p");

        } else {
            return false;
        }
    }
}   