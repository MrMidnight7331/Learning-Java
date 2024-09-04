package shapes;

import java.awt.*;

public class Square
{
    private int sizex;
    private int sizey;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;

  public Square()
    {
        sizex = 30;
        sizey = 30;
        xPosition = 60;
        yPosition = 50;
        color = "red";
        isVisible = false;
    }

    public void makeVisible()
    {
        isVisible = true;
        draw();
    }

    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }
    
    public void moveRight()
    {
        moveHorizontal(20);
    }

    public void moveLeft()
    {
        moveHorizontal(-20);
    }

    public void moveUp()
    {
        moveVertical(-20);
    }

    public void moveDown()
    {
        moveVertical(20);
    }

    public void moveHorizontal(int distance)
    {
        erase();
        xPosition = xPosition+distance;
        draw();
    }

    public void moveVertical(int distance)
    {
        erase();
        yPosition =yPosition+ distance;
        draw();
    }

    public void changeSize(int newSizex, int newSizey)
    {
        erase();
        sizex = newSizex;
        sizey = newSizey;
        draw();
    }

    public void changeColor(String newColor)
    {
        color = newColor;
        draw();
    }

    /*
     * Draw the square with current specifications on screen.
     */
    private void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color,
                    new Rectangle(xPosition, yPosition, sizex, sizey));
            canvas.wait(10);
        }
    }

    /*
     * Erase the square on screen.
     */
    private void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}
