public class Waitingroom {
    private Queue<Patient> q1, q2, q3, q4, q5;

    public Waitingroom() {
        q1 = new Queue<Patient>();
        q2 = new Queue<Patient>();
        q3 = new Queue<Patient>();
        q4 = new Queue<Patient>();
        q5 = new Queue<Patient>();
    }

    private int translateStatus(String status) {
        if (status.equals("NP")) return 1;  // Notfallpatient
        if (status.equals("KP")) return 2;  // Kassenpatient
        if (status.equals("KPT")) return 3; // Kassenpatient mit Termin
        if (status.equals("PP")) return 4;  // Privatpatient
        if (status.equals("PPT")) return 5; // Privatpatient mit Termin
        return 0; // Invalid status
    }

    public void sign_patient(String name, String status) {
        int numericStatus = translateStatus(status);
        Patient newPatient = new Patient(name, numericStatus);

        if (numericStatus == 1) q1.enqueue(newPatient);
        else if (numericStatus == 2) q2.enqueue(newPatient);
        else if (numericStatus == 3) q3.enqueue(newPatient);
        else if (numericStatus == 4) q4.enqueue(newPatient);
        else if (numericStatus == 5) q5.enqueue(newPatient);
        else System.out.println("Ungültiger Status für " + name);
    }

    public Patient call_patient() {
        if (!q1.isEmpty()) {
            Patient p = q1.front();
            q1.dequeue();
            return p;
        }
        if (!q3.isEmpty()) {
            Patient p = q3.front();
            q3.dequeue();
            return p;
        }
        if (!q5.isEmpty()) {
            Patient p = q5.front();
            q5.dequeue();
            return p;
        }
        if (!q4.isEmpty()) {
            Patient p = q4.front();
            q4.dequeue();
            return p;
        }
        if (!q2.isEmpty()) {
            Patient p = q2.front();
            q2.dequeue();
            return p;
        }
        return null; 
    }

    public void print_waiting_list() {
        System.out.println("Aktuelle Warteliste:");
        System.out.println("Notfallpatienten: " + (q1.isEmpty() ? "Keine" : "Vorhanden"));
        System.out.println("Kassenpatienten: " + (q2.isEmpty() ? "Keine" : "Vorhanden"));
        System.out.println("Kassenpatienten mit Termin: " + (q3.isEmpty() ? "Keine" : "Vorhanden"));
        System.out.println("Privatpatienten: " + (q4.isEmpty() ? "Keine" : "Vorhanden"));
        System.out.println("Privatpatienten mit Termin: " + (q5.isEmpty() ? "Keine" : "Vorhanden"));
    }
}
