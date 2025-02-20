public class Main {
	public static void main(String[] args) {
		Programm programm = new Programm();
		programm.output();
		System.out.println("Anzahl der Elemente: " + programm.count());
		System.out.println("Maximaler Wert: " + programm.max());
		System.out.println("Minimaler Wert: " + programm.min());
		System.out.println("Search: " + programm.search(300));
	}
}