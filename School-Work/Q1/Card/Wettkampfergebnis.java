public class Wettkampfergebnis {
    private List<Wettkampfkarte> alleWettkaempfe;
    private int anzahlWettkampfkarten;

    public Wettkampfergebnis() {
        // Liste wird erzeugt und Anzahl der Wettkampfkarten auf 0 setzen.
        anzahlWettkampfkarten = 0;
        alleWettkaempfe = new List<>();
    }

    public void ergaenzeKarte(Wettkampfkarte pW) {
        // Die neue Wettkampfkarte pW wird hinten in die Liste eingefügt
        // und die Anzahl der Wettkampfkarten erhöht sich um eins.
        Wettkampfkarte wk = new Wettkampfkarte(pW.getName(), pW.getVorname(), pW.getKlasse());
        alleWettkaempfe.append(wk);
        anzahlWettkampfkarten++;
    }

    public Wettkampfkarte besteKarte(int pDisziplin) {
        // Je nach angegebener Disziplin wird die Beste Wettkampfkarte aus der Liste gesucht und zurückgegeben.
        // Sortiere die Liste nach der angegebenen Disziplin und gib das erste Element zurück.
        List<Wettkampfkarte> hilfsliste = new List<>();
        alleWettkaempfe.toFirst();
        while (alleWettkaempfe.hasAccess()) {
            Wettkampfkarte wk = alleWettkaempfe.getContent();
            hilfsliste.append(wk);
            alleWettkaempfe.next();
        }

        hilfsliste.toFirst();
        Wettkampfkarte besteKarte = hilfsliste.getContent();
        while (hilfsliste.hasAccess()) {
            if (hilfsliste.getContent().getPunkte(pDisziplin) > besteKarte.getPunkte(pDisziplin)) {
                besteKarte = hilfsliste.getContent();
            }
            hilfsliste.next();
        }
        return besteKarte;
    }

    // UNVERÄNDERT LASSEN
    public void ausgabe() {
        alleWettkaempfe.toFirst();
        while (alleWettkaempfe.hasAccess()) {
            System.out.println(alleWettkaempfe.getContent().toString());
            alleWettkaempfe.next();
        }
    }

    public void auswahlSort(int pDisziplin) {
        // Die Wettkampfkarten in der Liste alleWettkaempfe sollen
        // so sortiert werden, dass sie in einer absteigenden
        // Reihenfolge nach der angegebenen Disziplin aufgelistet
        // sind.
        // Tipp: Benutze eine Hilfsliste. Aber am Ende muss die
        // korrekte Reihenfolge in der Liste alleWettkaempfe vorliegen.

        List<Wettkampfkarte> hilfsliste = new List<>();
        alleWettkaempfe.toFirst();
        while (alleWettkaempfe.hasAccess()) {
            Wettkampfkarte wk = alleWettkaempfe.getContent();
            hilfsliste.append(wk);
            alleWettkaempfe.next();
        }

        // Sort the hilfsliste based on the specified discipline
        hilfsliste.toFirst();
        while (hilfsliste.hasAccess()) {
            Wettkampfkarte current = hilfsliste.getContent();
            hilfsliste.next();
            while (hilfsliste.hasAccess()) {
                if (hilfsliste.getContent().getPunkte(pDisziplin) > current.getPunkte(pDisziplin)) {
                    Wettkampfkarte temp = current;
                    current = hilfsliste.getContent();
                    hilfsliste.setContent(temp);
                }
                hilfsliste.next();
            }
            hilfsliste.toFirst();
        }

        // Copy sorted hilfsliste back to alleWettkaempfe
        alleWettkaempfe = new List<>();
        hilfsliste.toFirst();
        while (hilfsliste.hasAccess()) {
            alleWettkaempfe.append(hilfsliste.getContent());
            hilfsliste.next();
        }
    }

    // UNVERÄNDERT LASSEN
    public List<Wettkampfkarte> getWettkampfkarten() {
        return alleWettkaempfe;
    }
}