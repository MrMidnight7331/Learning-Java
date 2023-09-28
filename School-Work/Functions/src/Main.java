// Function, Set-Get-Methods, Parameters
// 21.September.2023
// By: Tieno
class Mensch {

  String name;
  int age;
  double height;
  String augenfarbe;
  char Geschlecht;
  double Gewicht;

  public Mensch(String pName , int pAge, double pHeight, String pAugenf, char pGesch, double pGewicht){

    name = pName;
    age = pAge;
    height = pHeight;
    augenfarbe = pAugenf;
    Gewicht = pGewicht;
    Geschlecht = pGesch;

  }

  public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setHeight(double newHeight) {
        height = newHeight;
    }

    public void setAugenfarbe(String newAugenfarbe) {
        augenfarbe = newAugenfarbe;
    }

    public void setGeschlecht(char newGeschlecht) {
        Geschlecht = newGeschlecht;
    }

    public void setGewicht(double newGewicht) {
        Gewicht = newGewicht;
    }


    // Get methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public String getAugenfarbe() {
        return augenfarbe;
    }

    public char getGeschlecht() {
        return Geschlecht;
    }

    public double getGewicht() {
        return Gewicht;
    }

}

//------------------------------------------------------------------------------------------------------------------------------
// Main class

public class Main{


  public static void main(String[] args){


    //String pName , int pAge, double pHeight, String pAugenf, char pGesch, double pGewicht



    Mensch mensch = new Mensch("Joaquin", 16, 1.79,"Braun",'M',78);

    mensch.setName("Tieno");
    mensch.setAge(16);
    mensch.setAugenfarbe("Braun");
    mensch.setGeschlecht('M');
    mensch.setHeight(1.67);
    mensch.setGewicht(57);


    System.out.println("Dein Mensch heit " + mensch.getName() +
            " er/sie ist " + mensch.getAge() + " Jahre alt, " +
            mensch.getHeight() + " Meter groß, seine Augenfarbe ist: " +
            mensch.getAugenfarbe() + " wiegt " + mensch.getGewicht() +
            " KG und hat den Geschlecht: " + mensch.getGeschlecht());
  }

}