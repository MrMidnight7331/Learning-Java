/**
 * @project Handy
 * @author Tieno
 * @version 2.0
 */

public class Handy {
    private int pin;
    private int mynummer;
    private int zustand;

    private Provider prov;

    public Handy(int pmynummer, int pPin) {
        mynummer = pmynummer;
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

    public int getmynummer() {
        return mynummer;
    }

    public void SendNachricht(String text, int phonenum) {
        if (zustand == 2) {
            prov.forwardmessage(text, phonenum);
        }
    }

    public void nachrichtEmpfangen(String text) {
        if (zustand == 2) {
            System.out.println("Empfangene Nachricht von Handy mynummer " + mynummer + ": " + text);
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