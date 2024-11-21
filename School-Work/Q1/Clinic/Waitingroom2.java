
class Patient {
    private String name;
    private int priority;

    public Patient(String pname, int ppriority) {
        this.name = pname;       
        this.priority = ppriority; 
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }
}

public class Waitingroom2 {
    private Queue<Patient> waitingQueue;

    public Waitingroom2() {
        waitingQueue = new Queue<>();
    }

    private int translateStatus(String status) {
        if (status.toUpperCase().equals("NP")) return 1;  // Notfallpatient
        if (status.toUpperCase().equals("KP")) return 5;  // Kassenpatient
        if (status.toUpperCase().equals("KPT")) return 3; // Kassenpatient mit Termin
        if (status.toUpperCase().equals("PP")) return 4;  // Privatpatient
        if (status.toUpperCase().equals("PPT")) return 2; // Privatpatient mit Termin
        return 0;
    }

    public void sign_patient(String name, String status) {
        int numericStatus = translateStatus(status);
        if (numericStatus == 0) {
            System.out.println("Ungültiger Status für " + name);
            return;
        }
        Patient newPatient = new Patient(name, numericStatus);
        waitingQueue.enqueue(newPatient);
    }

    public Patient call_patient() {
        if (waitingQueue.isEmpty()) {
            System.out.println("Keine Patienten in der Warteschlange.");
            return null;
        }

        
        Patient highestPriorityPatient = null;
        Queue<Patient> tmpQueue = new Queue<>();  

        while (!waitingQueue.isEmpty()) {
            Patient currentPatient = waitingQueue.front();
            if (highestPriorityPatient == null || currentPatient.getPriority() < highestPriorityPatient.getPriority()) {
                highestPriorityPatient = currentPatient;
            }
            tmpQueue.enqueue(currentPatient); 
            waitingQueue.dequeue(); 
        }

        
        Patient nextPatient = highestPriorityPatient;


        while (!tmpQueue.isEmpty()) {
            Patient tmpPatient = tmpQueue.front();
            tmpQueue.dequeue();
            if (tmpPatient != nextPatient) {
                waitingQueue.enqueue(tmpPatient);
            }
        }

        return nextPatient;
    }

    public void print_waiting_list() {
        if (waitingQueue.isEmpty()) {
            System.out.println("Die Warteschlange ist leer.");
            return;
        }

        System.out.println("Aktuelle Warteliste:");
        Queue<Patient> tmpQueue = new Queue<>(); 
        while (!waitingQueue.isEmpty()) {
            Patient patient = waitingQueue.front();
            System.out.println(patient.getName() + " / Priorität: " + patient.getPriority());
            tmpQueue.enqueue(patient);  
            waitingQueue.dequeue();  
        }

        while (!tmpQueue.isEmpty()) {
            Patient tmpPatient = tmpQueue.front();
            tmpQueue.dequeue();
            waitingQueue.enqueue(tmpPatient);  
        }
    }
}
