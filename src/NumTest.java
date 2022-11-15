public class NumTest {
    private boolean IsEven(int number) {
        for (int i = -2147483647; i <= 2147483647; i++) { //entire "int" range
            if (i == number) {
                number %= 1000000000;
                number %= 100000000;
                number %= 10000000;
                number %= 1000000;
                number %= 100000;
                number %= 10000;
                number %= 1000;
                number %= 100;
                number %= 10;
                number %= 2;
                if (number == 0) return true;
            }
        }
        return false;
    }
    private boolean IsEven2(int number) {
        if (number % 2 == 0) return true;
        else return false;
    }
}