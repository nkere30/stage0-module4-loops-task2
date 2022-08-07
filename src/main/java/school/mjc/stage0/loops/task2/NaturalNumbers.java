package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public static void naturalNumbersPrinter(int lastPrinted) {
        int firstPrinted = 0;
        while(firstPrinted <= lastPrinted) {
            System.out.println(firstPrinted);
            firstPrinted++;
        }
    }

    public static void main(String[] args) {
        naturalNumbersPrinter(6);
    }
}
