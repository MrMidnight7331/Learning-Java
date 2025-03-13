public class Wettkampfkarte {
	private String name;
	private String vorname;
	private String klasse;
	private int punkteLauf;   // 1
	private int punkteSprung; // 2
	private int punkteWurf;   // 3
	// 4 = Gesamtwert

	// Existing constructor remains unchanged
	public Wettkampfkarte(String pName, String pVorname, String pKlasse) {
		name = pName;
		vorname = pVorname;
		klasse = pKlasse;
		punkteLauf = 0;
		punkteSprung = 0;
		punkteWurf = 0;
	}

	// New constructor to handle the single string input
	public Wettkampfkarte(String inhalt) {
		String[] parts = inhalt.split(",");
		if (parts.length >= 3) {
			this.name = parts[0];
			this.vorname = parts[1];
			this.klasse = parts[2];
		}
		if (parts.length >= 4) {
			this.punkteLauf = Integer.parseInt(parts[3]);
		}
		if (parts.length >= 5) {
			this.punkteSprung = Integer.parseInt(parts[4]);
		}
		if (parts.length >= 6) {
			this.punkteWurf = Integer.parseInt(parts[5]);
		}
	}

	public String getName() {
		return name;
	}

	public String getVorname() {
		return vorname;
	}

	public String getKlasse() {
		return klasse;
	}

	public int getPunkte(int pDisziplin) {
		if (pDisziplin == 1) return punkteLauf;
		if (pDisziplin == 2) return punkteSprung;
		if (pDisziplin == 3) return punkteWurf;
		if (pDisziplin == 4) return punkteLauf + punkteSprung + punkteWurf;
		return -1;
	}

	public void setzePunkte(int pDisziplin, int pPunkte) {
		if (pDisziplin == 1) punkteLauf = pPunkte;
		if (pDisziplin == 2) punkteSprung = pPunkte;
		if (pDisziplin == 3) punkteWurf = pPunkte;
	}

	public String toString() {
		return name + "," + klasse + "," + punkteLauf + "," + punkteSprung + "," + punkteWurf;
	}
}
