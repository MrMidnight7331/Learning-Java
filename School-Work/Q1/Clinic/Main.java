public class Main {
    public static void main(String[] args) {
        Clinic clinic = new Clinic();

        clinic.recieve_patient2("Herr Meier", "KPT");
        clinic.recieve_patient2("Frau Schmidt", "KP");
        clinic.recieve_patient2("Herr Overmann", "KPT");
        clinic.recieve_patient2("Frau Groß", "PPT");
        clinic.recieve_patient2("Herr Mohnsmeier", "np");
        clinic.recieve_patient2("Frau Seidel", "pp");
        clinic.recieve_patient2("Herr Guntz", "kp");
        

        clinic.print_list2();

        clinic.call2();  
        clinic.call2();  
        clinic.call2();
        clinic.call2();  
        clinic.call2();  
        clinic.call2(); 
        clinic.call2();  

    }
}
