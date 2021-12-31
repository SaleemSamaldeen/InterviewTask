package Programs;

public class FibonacciSeries {

    public static void testFibonacciSeries(int count) {
        int prevNum = 0;
        int nextNum = 1;
        for (int i = 0; i < count; i++) {
            System.out.println("Fibonacci Series: " + prevNum);
            int sum = prevNum + nextNum;
            prevNum = nextNum;
            nextNum = sum;
        }
    }

    public static void main(String[] args) {
        testFibonacciSeries(10);
    }
}
