/**
 * @project Handy
 * @author Tieno
 * @version 1.0
 */

public class Handy {
    private int pin;
    private int nummer;
    private int zustand;

    public Handy(int pNummer, int pPin) {
        nummer = pNummer;
        pin = pPin;
        zustand = 0; // Phone off
    }

    public void turnon() {
        if (zustand == 0) {
            zustand = 1; // Phone on, but not active
        }
    }

    public void turnoff() {
        zustand = 0; // Phone off
    }

    public void pinChange(int pinAlt, int pinNeu) {
        if (pin == pinAlt) {
            pin = pinNeu;
        }
    }

    public void activate(int pPin) {
        if (zustand == 1 && pin == pPin) {
            zustand = 2; // Phone on and active
        }
    }

    public int getZustand() {
        return zustand;
    }

    public int getNumber() {
        return nummer;
    }

    public void SendMessage(String text, Handy h) {
        if (zustand == 2) {
            h.nachrichtEmpfangen(text);
        }
    }

    public void nachrichtEmpfangen(String text) {
        if (zustand == 2) {
            System.out.println("Empfangene Nachricht von Handy Nummer " + nummer + ": " + text);
        }
    }
}