/**
 * @project Shapes n shit
 * @author Tieno
 * @version x
 */

package shapes;

public class Main {
    public static void main(String[] args) {


        Interactive interactive = new Interactive();
        try {
            interactive.main(args);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




    }
}
