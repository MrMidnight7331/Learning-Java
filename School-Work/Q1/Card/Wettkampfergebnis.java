public class Wettkampfergebnis
{
	private List<Wettkampfkarte> alleWettkaempfe;
	private int anzahlWettkampfkarten;

	public Wettkampfergebnis()
	{
		// Liste wird erzeugt und Anzahl der Wettkampfkarten auf 0 setzen.
		alleWettkaempfe = new List<>();
		anzahlWettkampfkarten = 0;
	}

	public void ergaenzeKarte(Wettkampfkarte pW){
		// Neue Wettkampfkarte hinzufügen und Anzahl erhöhen
		alleWettkaempfe.append(pW);
		anzahlWettkampfkarten++;
	}

	public Wettkampfkarte besteKarte(int pDisziplin){
		alleWettkaempfe.toFirst();
		Wettkampfkarte beste = null;
		int bestePunkte = -1;

		while (alleWettkaempfe.hasAccess()) {
			Wettkampfkarte aktuelle = alleWettkaempfe.getContent();
			if (aktuelle.getPunkte(pDisziplin) > bestePunkte) {
				bestePunkte = aktuelle.getPunkte(pDisziplin);
				beste = aktuelle;
			}
			alleWettkaempfe.next();
		}
		return beste;
	}

	public void auswahlSort(int pDisziplin) {
		List<Wettkampfkarte> hilfsliste = new List<>();

		while (!alleWettkaempfe.isEmpty()) {
			Wettkampfkarte beste = besteKarte(pDisziplin);
			alleWettkaempfe.toFirst();

			while (alleWettkaempfe.hasAccess()) {
				if (alleWettkaempfe.getContent() == beste) {
					alleWettkaempfe.remove();
					break;
				}
				alleWettkaempfe.next();
			}

			hilfsliste.append(beste);
		}

		alleWettkaempfe = hilfsliste;
	}

	// UNVERÄNDERT LASSEN
	public List<Wettkampfkarte> getWettkampfkarten(){
		return alleWettkaempfe;
	}
}
