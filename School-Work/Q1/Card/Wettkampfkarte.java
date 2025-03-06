public class Wettkampfkarte {
    private String name;
    private String vorname;
    private String klasse;
    private int punkteLauf;   // 1
    private int punkteSprung; // 2
    private int punkteWurf;   // 3
    // 4 = Gesamtwert

    public Wettkampfkarte(String pName, String pVorname, String pKlasse) {
        // Anfangswerte für Attribute festlegen
        name = pName;
        vorname = pVorname;
        klasse = pKlasse;
        punkteLauf = 0;
        punkteSprung = 0;
        punkteWurf = 0;
    }

    // UNVERÄNDERT LASSEN
    public Wettkampfkarte(String zeile) {
        String[] teile = zeile.split(",");
        name = teile[0];
        vorname = teile[1];
        klasse = teile[2];
        punkteLauf = Integer.valueOf(teile[3]);
        punkteSprung = Integer.valueOf(teile[4]);
        punkteWurf = Integer.valueOf(teile[5]);
    }

    public String getName() {
        // Der Wert des Attributs name wird zurückgegeben.
        return name;
    }

    public String getVorname() {
        // Der Wert des Attributs vorname wird zurückgegeben.
        return vorname;
    }

    public String getKlasse() {
        // Der Wert des Attributs klasse wird zurückgegeben.
        return klasse;
    }

    public int getPunkte(int pDisziplin) {
        /* Je nach angegebener Disziplin wird der Wert des entsprechenden
           Attributs zurückgegeben. Wenn eine falsche Zahl eingegeben wird
           soll -1 zurückgegeben werden */
        if (pDisziplin == 1) {
            return punkteLauf;
        } else if (pDisziplin == 2) {
            return punkteSprung;
        } else if (pDisziplin == 3) {
            return punkteWurf;
        } else {
            return -1;
        }
    }

    public void setzePunkte(int pDisziplin, int pPunkte) {
        /* Je nach angegebener Disziplin wird dem entsprechenden Attribut der
         * Punktwert pPunkte zugewiesen.
         * z.B. Wenn pDisziplin = 1 ist, dann wird dem Attribut
         * punkteLauf der Wert pPunkte zugewiesen. */
        if (pDisziplin == 1) {
            punkteLauf = pPunkte;
        } else if (pDisziplin == 2) {
            punkteSprung = pPunkte;
        } else if (pDisziplin == 3) {
            punkteWurf = pPunkte;
        } else {
            System.out.println("Invalid discipline number: " + pDisziplin);
        }
    }

    // UNVERÄNDERT LASSEN
    public String toString() {
        return name + "," + klasse + "," + punkteLauf + ","
                + punkteSprung + "," + punkteWurf;
    }
}