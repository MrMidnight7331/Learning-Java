import java.util.Random;
public class Lotto {
    public Lotto(){

        int lotto[] = new int[49];
        for(int i=0; i<49; i++){
            lotto[i]=i+1;
        }

    }

    public void get_lotto_numbers(){
        Random rand = new Random();
        for(int i=0; i<6; i++){
            

            int n = rand.nextInt(49)+1;
            System.out.println(n);
        }

    }
       
    
    
}
