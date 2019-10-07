package by.gsu.pmslab;
import java.util.Arrays;
import java.util.Scanner;

public class ThreadGenerator {
    public static void main(String[] args) {
        System.out.println("Введите количество потоков: ");
        Scanner scan = new Scanner(System.in);
        int Threadsamount = scan.nextInt();
        System.out.println(Threadsamount);
        int[] flows = new int[Threadsamount];
        int[] end = new int[Threadsamount];
        double[] result = new double[Threadsamount];
        for (int i = 1; i <= Threadsamount; i++) {
            System.out.println("Выберите операцию для " + i + " потока:" +
                    " \n1. Сложение.\n2. Вычитание.\n3. Умножение.");
            int operation = scan.nextInt();
            flows[i - 1] = operation;
            System.out.println("Введите число для " + i + " потока: ");
            end[i-1] = scan.nextInt();
        }
        execute(Threadsamount, end, result);
        getResult(result, Threadsamount, flows);
    }
    private static double[] execute(int Threadsamount, int[] end, double[] result) {
        for (int i = 0; i < Threadsamount; i++) {
            ClaculatorThread claculatorThread = new ClaculatorThread(end[i]);
            claculatorThread.start();
            result[i] = claculatorThread.getResult();
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
    private static void getResult(double[] result, int Threadsamount, int[] flows) {
        int summary = 0;
        for (int i=0; i < Threadsamount; i++){
            switch (flows[i]) {
                case 1: summary += result[i];
                    break;
                case 2: summary -= result[i];
                    break;
                case 3: summary *= result[i];
                    break;
                default: summary += 0;
                    break;
            }
        }
        System.out.println("Ответ: " + summary);
    }
}
