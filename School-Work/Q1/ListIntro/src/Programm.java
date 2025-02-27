public class Programm {
	private List<Integer> liste;

	public Programm() { // Constructor
		liste = new List<Integer>();

		liste.append(500);
		liste.append(300);
		liste.append(150);
		liste.append(250);
		liste.append(400);
		liste.append(700);
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

			}
			liste.next();
		}
		return max;
	}

	public int min() {
		int min = Integer.MAX_VALUE;
		liste.toFirst();
		while (liste.hasAccess()) {
			if (liste.getContent() < min) {
				min = liste.getContent();
			}
			liste.next();
		}
		return min;
	}

	public boolean search (int x){
		liste.toFirst();
		while (liste.hasAccess()) {
			if (liste.getContent() == x) {
				return true;
			}
			liste.next();
		}
		return false;
	}

	public void sort() {
		List<Integer> temp = new List<Integer>();
		liste.toFirst();
		while (liste.hasAccess()) {
			int current = liste.getContent();
			liste.next();
			temp.toFirst();
			while (temp.hasAccess() && temp.getContent() < current) {
				temp.next();
			}
			if (temp.hasAccess()) {
				temp.insert(current);
			} else {
				temp.append(current);
			}
		}
		liste = temp;
	}


	public void sortinsert(int x){
		liste.toFirst();
		while (liste.hasAccess() && liste.getContent() < x) {
			liste.next();
		}
		if (liste.hasAccess()) {
			liste.insert(x);
		} else {
			liste.append(x);
		}
	}

	public List<Integer> copyfrom(int x) {
		List<Integer> temp = new List<Integer>();
		liste.toFirst();
		while (liste.hasAccess()) {
			if (liste.getContent() > x) {
				temp.append(liste.getContent());
			}
			liste.next();
		}
		temp.toFirst();
		while (temp.hasAccess()) {
			System.out.println(temp.getContent());
			temp.next();
		}
		return temp;
	}
}
