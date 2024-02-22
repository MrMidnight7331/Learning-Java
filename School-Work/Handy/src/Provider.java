public class Provider {
    private String name;
    private Handy handy1;
    private Handy handy2;
    private Handy handy3;

    public Provider(){
        name = "vodaphone";
        handy1 = handy1;
        handy2 = handy2;
        handy3 = handy3;

    }
    public void connecthphone1(Handy pHandy){
        handy1 = pHandy;
    }
    public void connecthphone2(Handy pHandy){
        handy2 = pHandy;
    }
    public void connecthphone3(Handy pHandy){
        handy3 = pHandy;
    }
    public void disconnecthphone1(){
        handy1 = null;
    }
    public void disconnecthphone2(){
        handy2 = null;
    }
    public void disconnecthphone3(){
        handy3 = null;
    }
    public void forwardmessage(String text, int phonenum){
        if (phonenum == handy1.getNummer()){
            handy2.nachrichtEmpfangen(text);
        }
        if (phonenum == handy2.getNummer()){
            handy3.nachrichtEmpfangen(text);
        }
        if (phonenum == handy3.getNummer()){
            handy1.nachrichtEmpfangen(text);
        }
    }
}
