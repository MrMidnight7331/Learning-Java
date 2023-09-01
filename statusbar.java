import java.awt.*;
import javax.swing.*;

public class statusbar {
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();
    statusbar(){
        frame.setLocationRelativeTo(null);

        bar.setValue(0);
        bar.setBounds(0,0,420,100);

        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli", Font.BOLD,25));

        frame.add(bar);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,200);
        frame.setLayout(null);
        frame.setVisible(true);

        bar.setString("Collecting informations...");

        fill();
    }
    public void fill(){
        int counter = 0;
        while(counter<=100){
            bar.setValue(counter);
            try {
                Thread.sleep(80);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            counter += 1;
        }
        bar.setString("Finishing up...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        bar.setString("Done!");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        frame.dispose();
    }
}