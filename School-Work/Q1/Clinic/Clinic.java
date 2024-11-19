public class Clinic {
    private Waitingroom waitingroom;

    public Clinic() {
        waitingroom = new Waitingroom();
    }

    // Add a patient
    public void recieve_patient(String name, String status) {
        waitingroom.sign_patient(name, status);
    }

    // Call the next patient
    public void call() {
        Patient nextPatient = waitingroom.call_patient();
        if (nextPatient != null) {
            System.out.println("Der nächste Patient ist: " + nextPatient.getName());
        } else {
            System.out.println("Es sind keine Patienten mehr in der Warteschlange.");
        }
    }

    // Print the current waiting list
    public void print_list() {
        waitingroom.print_waiting_list();
    }
}
