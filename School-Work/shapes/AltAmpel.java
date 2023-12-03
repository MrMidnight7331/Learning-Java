package shapes;

public class AltAmpel {
    private Circle r;
    private Circle y;
    private Circle g;
    private Square bgr;
    private Square bgy;
    private Square bgg;

    private String state = "red";

    /**
     * Konstruktor fuer Objekte der Klasse Ampel
     */
    public AltAmpel() {
        bgr = new Square();
        bgr.moveHorizontal(-40);
        bgr.moveVertical(10);
        bgr.changeColor("black");
        bgr.makeVisible();
        r = new Circle();
        r.changeColor("red");
        r.makeVisible();

        bgy = new Square();
        bgy.moveHorizontal(-40);
        bgy.moveVertical(10 + 30);
        bgy.changeColor("black");
        bgy.makeVisible();
        y = new Circle();
        y.changeColor("yellow");
        y.moveVertical(30);
        y.makeInvisible();

        bgg = new Square();
        bgg.moveHorizontal(-40);
        bgg.moveVertical(10 + 60);
        bgg.changeColor("black");
        bgg.makeVisible();
        g = new Circle();
        g.changeColor("green");
        g.moveVertical(60);
        g.makeInvisible();

    }
        public void moveHorizontal(int h)
        {
            bgr.moveHorizontal(h);
            bgy.moveHorizontal(h);
            bgg.moveHorizontal(h);
            r.moveHorizontal(h);
            y.moveHorizontal(h);
            g.moveHorizontal(h);
        }
        public void moveVertical( int h)
        {
            bgr.moveVertical(h);
            bgy.moveVertical(h);
            bgg.moveVertical(h);
            r.moveVertical(h);
            y.moveVertical(h);
            g.moveVertical(h);
        }

    public void change() {
        if (state == "red") {
            r.makeVisible();
            y.makeVisible();
            g.makeInvisible();
            state = "yellow";

        } else if (state == "yellow") {
            r.makeInvisible();
            y.makeInvisible();
            g.makeVisible();
            state = "green";

        } else if (state == "green") {
            r.makeInvisible();
            y.makeVisible();
            g.makeInvisible();
            state = "yellow2";

        } else if (state == "yellow2") {
            r.makeVisible();
            y.makeInvisible();
            g.makeInvisible();
            state = "red";

        }

    }
    public void autoChange() throws InterruptedException {
        while (true) {
              // Change the state
            Thread.sleep(1000);
            change();// Sleep for 2 seconds (adjust as needed)
        }
    }

}