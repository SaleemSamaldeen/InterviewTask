package Programs;

public class PrimeNumbers {

    static int count = 0;

    public static void main(String args[]) {
        testPrimeNumbers(100);
    }

    public static void testPrimeNumbers(int maxNumber) {
        System.out.println("Prime Numbers:\n");
        for (int i = 2; i <= maxNumber; i++) {
            int flag = 1;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println(" " + i);
            }
        }
    }
}
