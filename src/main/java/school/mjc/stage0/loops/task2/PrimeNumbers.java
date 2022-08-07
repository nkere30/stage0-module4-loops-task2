package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public static void printPrimeNumbers(int printToInclusive) {
        int firstPrinted = 2;

        while(firstPrinted <= printToInclusive) {
            boolean isPrime = true;
            int counter = 2;
            while(counter < firstPrinted) {
                if(firstPrinted % counter == 0) {
                    isPrime = !isPrime;
                    counter = firstPrinted;
                }
                counter++;
            }
            if(isPrime) {
                System.out.println(firstPrinted);
            }
            firstPrinted++;
        }
    }

    public static void main(String[] args) {
        printPrimeNumbers(33);

    }
}
