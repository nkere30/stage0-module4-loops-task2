package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public static void printPower(int power) {
        if(power < 0) {
            System.out.println("too much power");
        } else {
            int counter = 1;
            int result = 1;
            System.out.println(result);
            while(counter <= power) {
                result *= 2;
                System.out.println(result);
                counter++;
            }
        }
    }

    public static void main(String[] args) {
        printPower(5);
    }
}
