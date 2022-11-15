public class CalculatePay {
    public static void main (String[] args) {
        System.out.println("$" + pay(17, 12));
    }
    public static double pay (double salary, int hours) {
        int overtime = 0;
        if (hours > 8)
            overtime = hours - 8;
        return hours * salary + salary * overtime;
    }
}