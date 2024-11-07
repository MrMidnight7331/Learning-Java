

public class Patient
{
    private String name, insurance;
    
    
    public Patient(String pName, String pinsurance)
    {
        name=pName;
        insurance=pinsurance;
    }
    
    public String getName(){
        return name;
    }
    
    public String getinsurance(){
        return insurance;
    }

    
}
