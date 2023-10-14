// BMI Calculator
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
            String weightInput = JOptionPane.showInputDialog(null, "Enter your weight in Kilogram", "BMI Calculator", JOptionPane.INFORMATION_MESSAGE);

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
            String heightInput = JOptionPane.showInputDialog(null, "Enter your height in Meters", "BMI Calculator", JOptionPane.INFORMATION_MESSAGE);

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


            // Calculating the BMI
            double BMI = weight / (height * height);

                if (BMI <= 18.5) {
                    categories = "Underweight";

                } else if (BMI >= 18.5 && BMI <= 24.9) {
                    categories = "Normal";

                } else if (BMI >= 25 && BMI <= 29.9) {
                    categories = "Overweight";

                } else if (BMI >= 30 && BMI <= 34.9) {
                    categories = "Obese (Class 1)";

                } else if (BMI >= 35 && BMI <= 39.9) {
                    categories = "Obese (Class 2)";

                } else if (BMI >= 40) {
                    categories = "Obese (Class 3)";
                } else {
                    categories = "Invalid";
                }

                JOptionPane.showMessageDialog(null, "Your BMI is: " + df.format(BMI) + " and you are " + categories, "BMI Calculator", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}