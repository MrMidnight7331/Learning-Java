public class Programm {
	private List<Integer> liste;

	public Programm() {
		liste = new List<Integer>();

		liste.append(500);
		liste.append(300);
		liste.append(150);
	}

	public void output() {

		liste.toFirst();
		while (liste.hasAccess()) {
			System.out.println(liste.getContent());
			liste.next();
		}
	}

	public int count() {
		int count = 0;

		liste.toFirst();
		while (liste.hasAccess()) {
			liste.next();
			count++;
		}
		return count;

	}

	public int max() {
		int max = 0;
		liste.toFirst();
		while (liste.hasAccess()) {
			if (liste.getContent() > max) {
				max = liste.getContent();
				break;
			}
		}
		return max;
	}

	public int min() {
		int min = 0;
		liste.toFirst();
		while (liste.hasAccess()) {
			if (liste.getContent() < min) {
				min = liste.getContent();
				break;

			}
		}
		return min;
	}

	public boolean search ( int x){
		liste.toFirst();
		while (liste.hasAccess()) {
			if (liste.getContent() == x) {
				return true;
			}
		}
		return false;
	}
}
