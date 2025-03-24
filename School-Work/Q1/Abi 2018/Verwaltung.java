

public class Verwaltung
{
    private List<Grundstueck> alleGrundstuecke;
    
    public Verwaltung()
    {
        alleGrundstuecke= new List<Grundstueck>();
    }
    
    public Grundstueck gibGrundstueck(String pStrasse, String pHausnummer){
        /*Die Methode liefert das Grundstücksobjekt mit der Adresse (pStrasse,
        pHausnummer) zurück. Falls zur Adresse kein Grundstücksobjekt existiert,
        wird null zurückgeliefert.*/
        
    }
    
    public void fuegeEinbruchHinzu(Grundstueck pGrundstueck, Einbruch pEinbruch){
        Grundstueck betroffenesGrundstueck = gibGrundstueck(pGrundstueck.gibStrasse(),pGrundstueck.gibHausnummer());
        if(betroffenesGrundstueck==null){
            alleGrundstuecke.append(pGrundstueck);
            betroffenesGrundstueck=pGrundstueck;
        }
        betroffenesGrundstueck.fuegeHinzu(pEinbruch);
        alleGrundstuecke.toFirst();
        while(alleGrundstuecke.hasAccess()){
            Grundstueck aktuelles = alleGrundstuecke.getContent();
            int abstand=aktuelles.gibAbstand(betroffenesGrundstueck);
            if(abstand<=1000){
                int wert=aktuelles.gibGefaehrdungsindex()-abstand;
                if(pEinbruch.istAufgeklaert()){
                    aktuelles.setzeGefaehrdungsindex(wert+1000);
                }else{
                    aktuelles.setzeGefaehrdungsindex(wert+2000);
                }
            }
            alleGrundstuecke.next();
        }
    }
    
    public List<Grundstueck> ermittleEinbruchsschwerpunkte(int pMinAnzahl){
        /* Aufgabe c) */
        
    }

    
}
