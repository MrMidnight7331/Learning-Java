import javax.swing.JOptionPane;

public class Main{
    public static void  main(String[] args){
        String input = JOptionPane.showInputDialog(null,"Enter your location:","Smart watherforcast", JOptionPane.INFORMATION_MESSAGE);
        while (input.isBlank()){
            JOptionPane.showMessageDialog(null, "Invalid input!","Invalid input!",JOptionPane.INFORMATION_MESSAGE);
            input = JOptionPane.showInputDialog("Enter your location:");
        }
        statusbar status = new statusbar();
        JOptionPane.showMessageDialog(null, "Maby try looking out your f*cking window?","You stupid!",JOptionPane.INFORMATION_MESSAGE);
    }
}