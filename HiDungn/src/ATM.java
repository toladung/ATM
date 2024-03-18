public class ATM {
    String name;
    int STK,sotien,tiengui,tiennhan;
    public ATM(){};
    public ATM(String name,int STK ,int sotien , int tiengui,int tiennhan){
        this.name = name;
        this.STK = STK;
        this. sotien = sotien;
        this.tiengui =tiengui;
        this.tiennhan = tiennhan;
    }
    public int ruttien(int sotien,int tiengui){
            return sotien = sotien+ tiengui;

    };
}
