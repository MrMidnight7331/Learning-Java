
public class Waitingroom {
    private Queue<Patient> waitingsnake;

    public Waitingroom() {
        waitingsnake = new Queue<Patient>();
    }

    public void signup(String pName, String pInsurance) {
        waitingsnake.enqueue(new Patient(pName, pInsurance));

    }

    public void call() {

        try {
            System.out.println("Next one in line: " + waitingsnake.front().getName() + " / " + waitingsnake.front().getinsurance());
            waitingsnake.dequeue();

        } catch (Exception e) {
            System.out.println("Next slot in Waitingsnake is empty :(");
        }

    }

    public void list() {
        if (!waitingsnake.isEmpty()) {
            System.out.println("List view:");
            Patient z = waitingsnake.front();
            System.out.println(waitingsnake.front().getName() + " / " + waitingsnake.front().getinsurance());
            waitingsnake.enqueue(waitingsnake.front());
            waitingsnake.dequeue();
            while (waitingsnake.front() != z) {
                System.out.println(waitingsnake.front().getName() + " / " + waitingsnake.front().getinsurance());
                waitingsnake.enqueue(waitingsnake.front());
                waitingsnake.dequeue();
            }
        } else {
            System.out.println("Empty ahhhh Waitingsnake");
        }
    }

    public int patientNums() {
        int count = 0;
        if (!waitingsnake.isEmpty()) {
            Patient z = waitingsnake.front();
            count++;
            waitingsnake.enqueue(waitingsnake.front());
            waitingsnake.dequeue();
            while (waitingsnake.front() != z) {
                count++;
                waitingsnake.enqueue(waitingsnake.front());
                waitingsnake.dequeue();
            }
        }
        return count;
    }
    

    public boolean searchpatient(String pName){
        boolean found = false;
        if (!waitingsnake.isEmpty()) {
            Patient z = waitingsnake.front();
            if (waitingsnake.front().getName().equals(pName)) {
                found = true;
            }
            waitingsnake.enqueue(waitingsnake.front());
            waitingsnake.dequeue();
            while (waitingsnake.front() != z) {
                if (waitingsnake.front().getName().equals(pName)) {
                    found = true;
                }
                waitingsnake.enqueue(waitingsnake.front());
                waitingsnake.dequeue();
            }
        }
        return found;
        
    }

}
