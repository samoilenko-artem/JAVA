package by.gsu.pmslab;

public class ClaculatorThread extends Thread {
    private int n;
    private double result = 1;
    public ClaculatorThread(int n){
        this.n = n;
    }
    public double getResult() {
        for(int i = 1; i <= n; i++){
            result = result * i;
        }
        return result;
    }
}
