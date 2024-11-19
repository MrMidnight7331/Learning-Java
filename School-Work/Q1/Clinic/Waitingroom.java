
public class Waitingroom
{
    private Queue<Patient> q1, q2, q3, q4, q5;
    private int status = 0;
    
    
    public Waitingroom()
    {
        q1=new Queue<Patient>();
        q2=new Queue<Patient>();
        q3=new Queue<Patient>();
        q4=new Queue<Patient>();
        q5=new Queue<Patient>();
        
    }
    
    public void sign_parient(String name, int status){
        if(status == 1 ){
            q1.enqueue(new Patient(name,status));
        }
        if(status == 2 ){
            q2.enqueue(new Patient(name,status));
        }
        if(status == 3 ){
            q3.enqueue(new Patient(name,status));
        }
        if(status == 4 ){
            q4.enqueue(new Patient(name,status));
        }
        if(status == 5 ){
            q5.enqueue(new Patient(name,status));
        }
        
    }
    
    public void call_patient(){
    
    }
    
}
