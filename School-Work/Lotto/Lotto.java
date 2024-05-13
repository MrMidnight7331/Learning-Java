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
        int[] numbers = new int[6];
        for(int i=0; i<6; i++){
            int n;
            boolean exists;
            do {
                exists = false;
                n = rand.nextInt(49) + 1;
                for (int j = 0; j < i; j++) {
                    if (numbers[j] == n) {
                        exists = true;
                        break;
                    }
                }
            } while (exists);
            numbers[i] = n;
            System.out.println(n);
        }
    }

    }
       
    
    
}
