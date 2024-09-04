// Konto program i guess
// By: Tieno

/* Konto:
 -Kontonummer : int
 -Kontostand: double = 0
 -Name: String / input
 -Alter: int / input
 --------------------
 Konstrukor:
 +Konto(int pkontonummer)

 Methoden:
 +Einzahlung(double betrag):void
 +Auszahlen(double betrag):void

 Klasse:
 +Kunde / Name / Alter

 +überweisen!

*/

public class Main {
    private String Name;
    private int Alter;

    public Main(String name, int alter) {
        Name = name;
        Alter = alter;
    }

    public String getName() {
        return Name;
    }

    public int getAlter() {
        return Alter;
    }
}
class Konto {
    private int Kontonummer;
    private double Kontostand;
    private Main kunde;

    public Konto(int kontonummer, Main kunde) {
        Kontonummer = kontonummer;
        Kontostand = 0;
        this.kunde = kunde;
    }

    public void Einzahlung(double betrag) {
        if (betrag >= 0) {
            Kontostand += betrag;
            System.out.println("Eine Einzahlung von " + betrag + " Euro war erfolgreich!");
        } else {
            System.out.println("Eine Einzahlung von " + betrag + " Euro war NICHT möglich!");
        }
    }

    public void Auszahlen(double betrag) {
        if (betrag >= 0 && betrag <= Kontostand) {
            Kontostand -= betrag;
            System.out.println("Eine Auszahlung von: " + betrag + " Euro war erfolgreich!");
        } else {
            System.out.println("Eine Auszahlung von: " + betrag + " Euro war NICHT möglich!");
        }
    }

    public void überweisen(double betrag, Konto konto) {
        if (betrag >= 0 && betrag <= Kontostand) {
            Kontostand -= betrag;
            konto.Kontostand += betrag;
            System.out.println("Eine Überweisung von: " + betrag + " Euro war erfolgreich!");
        } else {
            System.out.println("Eine Überweisung von: " + betrag + " Euro war NICHT möglich!");
        }
    }

    public void Kontoinfo() {
        System.out.println("Kontonummer: " + Kontonummer);
        System.out.println("Kontostand: " + Kontostand + " EUR");
        System.out.println("Kunde: " + kunde.getName());
        System.out.println("Alter: " + kunde.getAlter());
    }
}