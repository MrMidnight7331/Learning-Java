public class Wettkampfkarte
{
	private String name;
	private String vorname;
	private String klasse;
	private int punkteLauf;   // 1
	private int punkteSprung; // 2
	private int punkteWurf;   // 3
	// 4 = Gesamtwert


	public Wettkampfkarte(String pName, String pVorname, String pKlasse)
	{
		// Anfangswerte für Attribute festlegen
		name = pName;
		vorname = pVorname;
		klasse = pKlasse;
		punkteLauf = 0;
		punkteSprung = 0;
		punkteWurf = 0;
	}

	public String getName(){
		return name;
	}

	public String getVorname(){
		return vorname;
	}

	public String getKlasse(){
		return klasse;
	}

	public int getPunkte(int pDisziplin){
		if (pDisziplin == 1) return punkteLauf;
		if (pDisziplin == 2) return punkteSprung;
		if (pDisziplin == 3) return punkteWurf;
		return -1;
	}

	public void setzePunkte(int pDisziplin, int pPunkte){
		if (pDisziplin == 1) punkteLauf = pPunkte;
		if (pDisziplin == 2) punkteSprung = pPunkte;
		if (pDisziplin == 3) punkteWurf = pPunkte;
	}

	// UNVERÄNDERT LASSEN
	public String toString() {
		return name + "," + klasse + "," + punkteLauf + "," + punkteSprung + "," + punkteWurf;
	}
}
