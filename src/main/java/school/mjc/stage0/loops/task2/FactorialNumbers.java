package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public static void printFactorialRow(int printToInclusive) {
        int factorial = 1;
        int counter = 1;
        while(counter <= printToInclusive) {
            factorial *= counter;
            System.out.println(factorial);
            counter++;
        }
    }

    public static void main(String[] args) {
        printFactorialRow(5);
    }
}
