public class Main {
	public static void main(String[] args) {
		Grundstueck grundstueck1 = new Grundstueck("Main Street", "1A");
		Grundstueck grundstueck2 = new Grundstueck("Main Street", "2B");
		Grundstueck grundstueck3 = new Grundstueck("Second Street", "3C");

		Einbruch einbruch1 = new Einbruch(false);
		Einbruch einbruch2 = new Einbruch(true);
		Einbruch einbruch3 = new Einbruch(false);

		Verwaltung verwaltung = new Verwaltung();

		verwaltung.fuegeEinbruchHinzu(grundstueck1, einbruch1);
		verwaltung.fuegeEinbruchHinzu(grundstueck1, einbruch2);
		verwaltung.fuegeEinbruchHinzu(grundstueck2, einbruch3);

		Grundstueck foundGrundstueck = verwaltung.gibGrundstueck("Main Street", "1A");
		System.out.println("Found Grundstueck: " + foundGrundstueck.gibStrasse() + " " + foundGrundstueck.gibHausnummer());

		List<Grundstueck> schwerpunkte = verwaltung.ermittleEinbruchsschwerpunkte(1);
		System.out.println("Einbruchsschwerpunkte:");
		schwerpunkte.toFirst();
		while (schwerpunkte.hasAccess()) {
			Grundstueck g = schwerpunkte.getContent();
			System.out.println(g.gibStrasse() + " " + g.gibHausnummer());
			schwerpunkte.next();
		}
	}
}
