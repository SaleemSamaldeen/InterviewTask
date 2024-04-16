package Programs;

import java.util.Arrays;
import java.util.List;

public class PrimeNumbers {

    public static void main(String args[]) {
        testPrimeNumbers(25);
        findPrimeNumbers();
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

    public static void findPrimeNumbers() {
        List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        for(int i = 0; i<numbers.size(); i++) {
            int flag = 1;
            for(int j = 2; j<= numbers.get(i)/2; j++) {
                if(numbers.get(i) % j == 0) {
                   flag = 0;
                   break;
                }
            }
            if(flag==1) {
                System.out.println("Prime number  \n" + numbers.get(i));
            }
        }
    }
}
