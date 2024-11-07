

public class Waitingroom
{
    private Queue<Patient> waitingsnake;
    
    public Waitingroom()
    {
        waitingsnake=new Queue<Patient>();
    }
    
    public void signup(String pName, String pInsurance){
        waitingsnake.enqueue(new Patient(pName, pInsurance));
        
    }
    
    public void call(){
        System.out.println(waitingsnake.front().getName());
        
    }
    

    
}
