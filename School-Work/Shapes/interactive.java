/**
 * @project Interactive Panel
 * @author Tieno
 * @version 3.4
 */


package shapes;
import javax.swing.*;

public class Interactive {
    public static void main(String[] args) throws InterruptedException {
        Haus haus;
        Ampel ampel;
        AltAmpel altAmpel;

        String[] buttonInit = { "Ampel", "Haus", "AltAmpel" };
        String[] buttonHaus = { "light aus", "licht an" };
        String[] buttonAmpel = { "Automatisch", "Grün", "Gelb", "Rot" };
        String[] buttonAltAmpel = { "Automatisch", "Grün", "Gelb", "Rot" };

        int initChoice = JOptionPane.showOptionDialog(null, "Projekt:", "Shapes n shit", JOptionPane.INFORMATION_MESSAGE, 1, null, buttonInit, buttonInit);

        if (initChoice == -1) {
            System.exit(0);
        } else if (initChoice == 1) {
            int hausChoice = JOptionPane.showOptionDialog(null, "Haus Funktionen:", "Haus", JOptionPane.INFORMATION_MESSAGE, 1, null, buttonHaus, buttonHaus);

            if (hausChoice == -1) {
                System.exit(0);
            } else if (hausChoice == 1) {
                haus = new Haus();
                haus.lichtan();
            } else {
                haus = new Haus();
            }
        } else if (initChoice == 0) {
            int ampelChoice = JOptionPane.showOptionDialog(null, "Ampel Funktionen:", "Ampel", JOptionPane.INFORMATION_MESSAGE, 1, null, buttonAmpel, buttonAmpel);
            if (ampelChoice == -1) {
                System.exit(0);
            } else if (ampelChoice == 0) {
                ampel = new Ampel();
                ampel.countdown();
            } else if (ampelChoice == 1) {
                ampel = new Ampel();
                ampel.change();
                ampel.change();
            } else if (ampelChoice == 2) {
                ampel = new Ampel();
                ampel.change();
            } else {
                ampel = new Ampel();
            }
        } else if (initChoice == 2) {
            int altAmpelChoice = JOptionPane.showOptionDialog(null, "AltAmpel Funktionen:", "AltAmpel", JOptionPane.INFORMATION_MESSAGE, 1, null, buttonAltAmpel, buttonAltAmpel);

            if (altAmpelChoice == -1) {
                System.exit(0);
            } else {
                altAmpel = new AltAmpel();

                if (altAmpelChoice == 0) {
                    altAmpel.autoChange();
                } else if (altAmpelChoice == 1) {
                    altAmpel.change();
                    altAmpel.change();
                } else if (altAmpelChoice == 2) {
                    altAmpel.change();
                } else {
                }
            }
        }
    }
}
