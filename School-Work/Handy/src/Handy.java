/**
 * @project Handy
 * @author Tieno
 * @version 1.0
 */

public class Handy {
    private int pin;
    private int nummer;
    private int zustand;

    private Provider prov;

    public Handy(int pNummer, int pPin) {
        nummer = pNummer;
        pin = pPin;
        zustand = 0; // Phone off
    }

    public void anschalten() {
        if (zustand == 0) {
            zustand = 1; // Phone on, but not active
        }
    }

    public void ausschalten() {
        zustand = 0; // Phone off
    }

    public void pinWechseln(int pinAlt, int pinNeu) {
        if (pin == pinAlt) {
            pin = pinNeu;
        }
    }

    public void aktivieren(int pPin) {
        if (zustand == 1 && pin == pPin) {
            zustand = 2; // Phone on and active
        }
    }

    public int getZustand() {
        return zustand;
    }

    public int getNummer() {
        return nummer;
    }

    public void SendNachricht(String text, int phonenum) {
        if (zustand == 2) {
            prov.forwardmessage(text, phonenum);
        }
    }

    public void nachrichtEmpfangen(String text) {
        if (zustand == 2) {
            System.out.println("Empfangene Nachricht von Handy Nummer " + nummer + ": " + text);
        }
    }
    public void connectprov(Provider pp){
        if (zustand == 2) {
            prov = pp;
        }
    }
    public void disconnectprov(){
            prov = null;

    }
}