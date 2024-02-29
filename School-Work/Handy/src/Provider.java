/**
 * @project Provider
 * @author Tieno
 * @version 3.0
 */
public class Provider {


    private String name;
    private Handy handy1;
    private Handy handy2;
    private Handy handy3;

    Handy[] handys = {handy1, handy2, handy3};

    public Provider(){
        name = "vodaphone";
        handy1 = handy1;
        handy2 = handy2;
        handy3 = handy3;

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
