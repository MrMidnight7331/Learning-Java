/**
 * @project Ampel
 * @author Tieno
 * @version 2.3
 */

package shapes;

public class Ampel {
    private Square frame;
    private Circle light;

    private int token = 0;

    private int frameSizex = 300;
    private int frameSizey = 100;
    private int frameX = 10;
    private int frameY = 100;

    private int lightDiameter = 100;
    private int lightX = 50;
    private int lightY = 90;
    private String color = "red";

    public void change() {
        light.makeInvisible();  // Hide the previous light
        lightX += 100;

        token = (token + 1) % 3; // Update the token value

        if (token == 0) {
            // red
            color = "red";
        } else if (token == 1) {
            // yellow
            color = "yellow";
        } else if (token == 2) {
            // green
            lightX = 250; // Adjust the green light's horizontal position
            color = "green";
        }

        creatLight();  // Create and show the new light
    }

    public void countdown() throws InterruptedException {
        Thread.sleep(1000);
        for (int i = 2; i <= 3; i++) {
            change();

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


    private void creatLight() {
        light = new Circle();  // Create a new light
        light.makeVisible();
        light.changeSize(lightDiameter);
        light.moveHorizontal(lightX);
        light.moveVertical(lightY);
        light.changeColor(color);
    }

    public Ampel() {
        frame = new Square();

        // Frame creation
        frame.makeVisible();
        frame.changeSize(frameSizex, frameSizey);
        frame.moveHorizontal(frameX);
        frame.moveVertical(frameY);
        frame.changeColor("black");

        creatLight();  // Create and show the initial light (red)
    }
}
