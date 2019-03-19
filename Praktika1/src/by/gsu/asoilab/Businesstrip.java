package by.gsu.asoilab;

public class Businesstrip {
    private String account;
    private int transport;
    private int days;
    final int rate=25000;
    public Businesstrip(String account,int transport,int days){
        this.account = account;
        this.transport = transport;
        this.days = days;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getTransport() {
        return transport;
    }

    public void setTransport(int transport) {
        this.transport = transport;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    public int getTotal(){
        return transport + rate * days;
    }
    public String toString(){
        return rate+";"+account+";"+transport+";"+days+";";
    }
    public void show(){
        System.out.println("rate = "+rate +"\naccount = "+account+"\ntransport = "+transport
                +"\ndays ="+days+"\ntotal = "+getTotal());
    }
}
