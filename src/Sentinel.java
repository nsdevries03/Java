import java.util.*;

public class Sentinel {
    public static final int SENTINEL = -1;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number (-1 to quit): ");
        int number = console.nextInt();
        int min = number;
        while (number != SENTINEL) {
            if (number < min) {
                min = number;
            }
            System.out.print("Enter a number (-1 to quit): ");
            number = console.nextInt();
        }
        System.out.println("The minimum is " + min);
    }
}
