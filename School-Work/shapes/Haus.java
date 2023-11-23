package shapes;

public class Haus {
    private Square square;
    private Triangle t;
    private Square fenster;
    public boolean visibility = false;
    private int square_size = 150;
    private int square_hor = 100;
    private int square_ver = 200;
    private String haus_col = "black";
    private int tri_size_ver = 150;
    private int tri_size_hor = 200;
    private int tri_hor = 183;
    private int tri_ver = 100;

    private int fens_size = 50;
    private int fens_hor = 130;
    private int fens_ver = 230;
    private String fens_col = "yellow";

    public boolean lichtan() {
        if(visibility){
            visibility = false;
            fenster.makeInvisible();
            //fenster.changeColor(fens_col);
            return visibility;
        }
        else{

            visibility = true;
            fenster.makeVisible();
            fenster.changeColor(fens_col);
            return visibility;

        }



    }


    public Haus() {
        square = new Square();
        t = new Triangle();
        fenster = new Square();

        // Square
        square.makeVisible();
        square.changeColor(haus_col);
        square.changeSize(square_size);
        square.moveHorizontal(square_hor);
        square.moveVertical(square_ver);

        // Triangle
        t.makeVisible();
        t.changeColor("black");
        t.changeSize(tri_size_ver, tri_size_hor);
        t.moveHorizontal(tri_hor);
        t.moveVertical(tri_ver);

        // Fenster
        if (visibility) {
            fenster.makeVisible();
            fenster.changeColor(fens_col);
        } else {
            fenster.makeInvisible();
        }

        fenster.changeSize(fens_size);
        fenster.moveHorizontal(fens_hor);
        fenster.moveVertical(fens_ver);
    }
}