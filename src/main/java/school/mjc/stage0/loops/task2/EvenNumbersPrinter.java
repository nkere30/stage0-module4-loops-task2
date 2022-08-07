package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public static void printEvenNumbers(int printTillInclusive) {
        int firstPrinted = 0;
        while(firstPrinted <= printTillInclusive) {
            if(firstPrinted % 2 ==0) {
                System.out.println(firstPrinted);
            }
            firstPrinted++;
        }
    }

    public static void main(String[] args) {
        printEvenNumbers(16);
    }
}
