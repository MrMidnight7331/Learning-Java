/**
 * @project Provider
 * @author Tieno
 * @version 4.0
 */
public class Provider {
    private String name;
    Handy[] handys;

    public Provider(){
        name = "vodaphone";
        handys = new Handy[3];
    }

    public void connectphone(Handy pHandy){
        for (int i = 0; i < handys.length; i++){
            if (handys[i] == null){
                handys[i] = pHandy;
                break;
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
                break;
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