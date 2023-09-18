// BIM Calculator
// By: MrMidnight

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Main{
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
            // Variables
            double weight;
            double height;
            String categories;

        while (true){
            // Asking for weight input
            String weightInput = JOptionPane.showInputDialog(null, "Enter your weight in Kilogram", "IBM Calculator", JOptionPane.INFORMATION_MESSAGE);

            if (weightInput == null){
                System.exit(0); // exit if user presses cancel
            }


            // If input is string, restart the loop
            try {
                weight = Double.parseDouble(weightInput);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input!", "Input is not acceptable!", JOptionPane.INFORMATION_MESSAGE);
                continue;
            }

            if (weight <= 0 ) {
                JOptionPane.showMessageDialog(null, "Invalid input!", "Input a negative number!", JOptionPane.INFORMATION_MESSAGE);
                continue;
            }

            // Asking for height input
            String heightInput = JOptionPane.showInputDialog(null, "Enter your height in Meters", "IBM Calculator", JOptionPane.INFORMATION_MESSAGE);

            if (heightInput == null){
                System.exit(0); // exit if user presses cancel
            }

            // If input is string, restart the loop
            try {
                height = Double.parseDouble(heightInput);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input!", "Input is not cceptable!", JOptionPane.INFORMATION_MESSAGE);
                continue;
            }

            if (height <= 0 ) {
                JOptionPane.showMessageDialog(null, "Invalid input!", "Input a negative number!", JOptionPane.INFORMATION_MESSAGE);
                continue;
            }


            // Calculating the BIM
            double BIM = weight / (height * height);

                if (BIM <= 18.5) {
                    categories = "Underweight";

                } else if (BIM >= 18.5 && BIM <= 24.9) {
                    categories = "Normal";

                } else if (BIM >= 25 && BIM <= 29.9) {
                    categories = "Overweight";

                } else if (BIM >= 30 && BIM <= 34.9) {
                    categories = "Obese (Class 1)";

                } else if (BIM >= 35 && BIM <= 39.9) {
                    categories = "Obese (Class 2)";

                } else if (BIM >= 40) {
                    categories = "Obese (Class 3)";
                } else {
                    categories = "Invalid";
                }

                JOptionPane.showMessageDialog(null, "Your BIM is: " + df.format(BIM) + " and you are " + categories, "IBM Calculator", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}