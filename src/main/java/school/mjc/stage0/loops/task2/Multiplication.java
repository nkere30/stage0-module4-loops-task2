package school.mjc.stage0.loops.task2;

public class Multiplication {
    public static void printMultiplied(int multiplyByAndToInclusive) {
        int firstPrinted = 0;
        int result = 0;
        if(multiplyByAndToInclusive < 0) {
            while(firstPrinted >= multiplyByAndToInclusive) {
                result = (-1) * firstPrinted * multiplyByAndToInclusive;
                System.out.println(result);
                firstPrinted--;
            }
        } else {
            while(firstPrinted <= multiplyByAndToInclusive) {
                result = firstPrinted * multiplyByAndToInclusive;
                System.out.println(result);
                firstPrinted++;
            }
        }
    }

    public static void main(String[] args) {
        //printMultiplied(5);
        printMultiplied(-5);
    }
}
