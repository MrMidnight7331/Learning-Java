public class Main {
    public static void main(String[] args) {
		Waitingroom w = new Waitingroom();
        w.signup("Justus", "sAAs");
        w.signup("Eliah", "Fat");
        
        System.out.println(w.patientNums());
        System.out.println(w.searchpatient("Justus"));

    }
}