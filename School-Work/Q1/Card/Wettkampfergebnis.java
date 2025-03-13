public class Wettkampfergebnis {
	private List<Wettkampfkarte> alleWettkaempfe;
	private int anzahlWettkampfkarten;

	public Wettkampfergebnis() {
		alleWettkaempfe = new List<>();
		anzahlWettkampfkarten = 0;
	}

	public void ergaenzeKarte(Wettkampfkarte pW) {
		alleWettkaempfe.append(pW);
		anzahlWettkampfkarten++;
	}

	public Wettkampfkarte besteKarte(int pDisziplin) {
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

	public List<Wettkampfkarte> getWettkampfkarten() {
		return alleWettkaempfe;
	}
}
