

public class Grundstueck
{
    private String strasse, hausnummer;
    private int gefaehrdungsindex;
    private List<Einbruch> einbrueche;
    
    public Grundstueck(String pStrasse, String pHausnummer)
    {
        strasse = pStrasse;
        hausnummer = pHausnummer;
        gefaehrdungsindex=0;
        einbrueche = new List<Einbruch>();
    }
    
    public String gibStrasse(){
        return strasse;
    }
    
    public String gibHausnummer(){
        return hausnummer;
    }
    
    public int gibGefaehrdungsindex(){
        return gefaehrdungsindex;
    }
    
    public List<Einbruch> gibEinbrueche(){
        return einbrueche;
    }
    
    public int gibAbstand(Grundstueck pGrundstueck){
        int zufallszahl = (int)((Math.random()*3000)+1);
        return zufallszahl;
    }
    
    public void setzeGefaehrdungsindex(int pGefaehrdungsindex){
        gefaehrdungsindex=pGefaehrdungsindex;
    }
    
    public void fuegeHinzu(Einbruch pEinbruch){
        einbrueche.append(pEinbruch);
    }

    
}
