// Advanced BMI Calculator
// By: MrMidnight

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    static double weight;
    static double height;
    static double BMI;
    static String categories;

    static class Bmicalc {
        public double calculated(double weight, double height) {
            return weight / (height * height);
        }
    }
    static class Heightcalc {
        public double calculated(double weight, double BMI) {
            return Math.sqrt(weight / BMI);
        }
    }

    static class Weightcalc {
        public double calculated(double height, double BMI) {
            return BMI * (height * height);
        }
    }

    public static double getHeightInput() {
        while (true) {
            String heightInput = JOptionPane.showInputDialog(null, "Enter your height in Meters", "Advanced BMI Calculator", JOptionPane.INFORMATION_MESSAGE);

            if (heightInput == null) {
                System.exit(0);
            }

            try {
                return Double.parseDouble(heightInput);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input!", "Input is not acceptable!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static double getWeightInput() {
        while (true) {
            String weightInput = JOptionPane.showInputDialog(null, "Enter your weight in Kilograms", "Advanced BMI Calculator", JOptionPane.INFORMATION_MESSAGE);

            if (weightInput == null) {
                System.exit(0);
            }

            try {
                return Double.parseDouble(weightInput);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input!", "Input is not acceptable!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static double getBMIInput() {
        while (true) {
            String BMIInput = JOptionPane.showInputDialog(null, "Enter your BMI", "Advanced BMI Calculator", JOptionPane.INFORMATION_MESSAGE);

            if (BMIInput == null) {
                System.exit(0);
            }

            try {
                return Double.parseDouble(BMIInput);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input!", "Input is not acceptable!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            String[] buttons = { "Height", "Weight", "BMI" };

            int choice = JOptionPane.showOptionDialog(null, "Calculators available:", "Advanced BMI Calculator", JOptionPane.INFORMATION_MESSAGE, 1, null, buttons, buttons);

            Bmicalc bmicalc = new Bmicalc();
            Heightcalc heightcalc = new Heightcalc();
            Weightcalc weightcalc = new Weightcalc();

            if (choice == 2) {
                height = getHeightInput();
                weight = getWeightInput();

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

                JOptionPane.showMessageDialog(null, "Your BMI is: " + df.format(bmicalc.calculated(weight, height)) + " and you are: " + categories, "Advanced BMI Calculator", JOptionPane.INFORMATION_MESSAGE);

            } else if (choice == 1) {
                BMI = getBMIInput();
                height = getHeightInput();
                JOptionPane.showMessageDialog(null, "Your estimated weight is: " + df.format(weightcalc.calculated(height, BMI)), "Advanced BMI Calculator", JOptionPane.INFORMATION_MESSAGE);

            } else if (choice == 0) {
                BMI = getBMIInput();
                weight = getWeightInput();
                JOptionPane.showMessageDialog(null, "Your estimated height is: " + df.format(heightcalc.calculated(weight, BMI)), "Advanced BMI Calculator", JOptionPane.INFORMATION_MESSAGE);
            } else if (choice == -1) {
                System.exit(0);
            }
        }
    }
}
