
public class Day{
    private int tempMin;
    private int tempMax;
    private int rainpossible;
    private int daytime;
    private boolean slip;
   
    public Day(int t, int tMin, int tMax, int rw, int sst)
    {
        tempMin=tMin;
        tempMax=tMax;
        rainpossible=rw;
        daytime=sst;
        if(tMin<=3 || tMax<=3){
            slip=true;
        }else{
            slip=false;
        }
    }
    
    public int getMinTemp(){
        return tempMin;
    }
    
    public int getMaxTemp(){
        return tempMax;
    }
    
    public int getRegenwahr(){
        return rainpossible;
    }
    
    public int getdaytime(){
        return daytime;
    }
    
    public boolean getslip(){
        return slip;
    }
}