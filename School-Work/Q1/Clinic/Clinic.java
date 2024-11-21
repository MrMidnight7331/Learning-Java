public class Clinic {
    private Waitingroom waitingroom;
    private Waitingroom2 waitingroom2;

    public Clinic() {
        waitingroom = new Waitingroom();  // Assuming Waitingroom is implemented similarly
        waitingroom2 = new Waitingroom2();
    }

    public void recieve_patient(String name, String status) {
        waitingroom.sign_patient(name, status);
    }

    public void recieve_patient2(String name, String status){
        waitingroom2.sign_patient(name, status);
    }

    public void call() {
        Patient nextPatient = waitingroom.call_patient();
        if (nextPatient != null) {
            System.out.println("Der nächste Patient ist: " + nextPatient.getName());
        } else {
            System.out.println("Es sind keine Patienten mehr in der Warteschlange.");
        }
    }

    public void call2() {
        Patient nextPatient2 = waitingroom2.call_patient();
        if (nextPatient2 != null) {
            System.out.println("Der nächste Patient ist: " + nextPatient2.getName());
        } else {
            System.out.println("Es sind keine Patienten mehr in der Warteschlange.");
        }
    }

    public void print_list2() {
        waitingroom2.print_waiting_list();
    }
}
