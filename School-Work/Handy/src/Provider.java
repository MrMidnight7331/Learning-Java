/**
 * @project Provider
 * @author Tieno
 * @version 4.2
 */
public class Provider {
    private String name;
    Handy[] handys = new Handy[3];

    public Provider(){
        name = "vodaphone";
    }

    public void connectphone(Handy pHandy){
        for (int i = 0; i < handys.length; i++){
            if (handys[i] == null){
                handys[i] = pHandy;
            }
            else {
                System.out.println("All slots r full UwU");
            }
        }
    }

    public void disconnectphone() {
        for (int i = 0; i < handys.length; i++) {
            if (handys[i] != null) {
                handys[i] = null;
            }
        }
    }

    public void forwardmessage (String text,int phonenum){
        for (int i = 0; i < handys.length; i++) {
            if (handys[i].getmynummer() == phonenum) {
                handys[i].nachrichtEmpfangen(text);
            }
        }
    }
}