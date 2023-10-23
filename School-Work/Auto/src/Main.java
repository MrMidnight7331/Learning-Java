// Auto i guess
// By: Tieno

public class Main {
    private int kilometerstand;
    private int tankinhalt;
    private int verbrauch;
    private int tankgroesse;

    // Konstruktor
    public Main(int pTankgroesse, int pVerbrauch) {
        tankgroesse = pTankgroesse;
        verbrauch = pVerbrauch;
        kilometerstand = 0;
        tankinhalt = tankgroesse;
    }

    // ---Methoden---

    // get Kilometerstand
    public int getKilometerstand() {
        return kilometerstand;
    }
    // get Tankinhalt
    public int getTankinhalt() {
        return tankinhalt;
    }

    // Tanken
    public void tanken(int liter) {
        if (tankinhalt + liter <= tankgroesse) {
            tankinhalt += liter;
        } else {
            System.out.println("Der Tank ist voll. Hör auf zu tanken!");
        }
    }

    // Fahren
    public void fahren(int km) {
        int verbrauchsMenge = km * verbrauch;
        if (verbrauchsMenge <= tankinhalt) {
            kilometerstand += km;
            tankinhalt -= verbrauchsMenge;
            System.out.println("Du hast: " + km + " hinter dir gelegt");
        } else {
            System.out.println("No Treibstoff :( Tanken bidde");
        }
    }
}
