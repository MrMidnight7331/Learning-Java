public class Main {
    public static void main(String[] args) {
        Clinic Clinic = new Clinic();

        Clinic.recieve_patient("Herr Meier", "KPT");
        Clinic.recieve_patient("Frau Schmidt", "KP");
        Clinic.recieve_patient("Herr Overmann", "KPT");
        Clinic.recieve_patient("Frau Groß", "PPT");
        Clinic.recieve_patient("Herr Mohnsmeier", "NP");
        Clinic.recieve_patient("Frau Seidel", "PP");
        Clinic.recieve_patient("Herr Guntz", "KP");
        Clinic.recieve_patient("Frau Petermann", "PP");
        Clinic.recieve_patient("Frau Osterbach", "NP");
        Clinic.recieve_patient("Herr Gansera", "KPT");

        Clinic.print_list();

        for(int i = 0; i< 10; i++){
            Clinic.call();
        }

        
    }
}
