

public class Einbruch
{
    private boolean aufgeklaert;
    
    public Einbruch(boolean pAufgeklaert)
    {
       aufgeklaert = pAufgeklaert;
    }
    
    public boolean istAufgeklaert(){
        return aufgeklaert;
    }
    
    public void setzeAufgeklaert(boolean pAufgeklaert){
        aufgeklaert=pAufgeklaert;
    }

    
}
