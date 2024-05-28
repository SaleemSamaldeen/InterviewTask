package Programs;

import java.util.Arrays;

public class SecondLargestNumber {


    public static void main(String args[]) {
        int[] numbers = { 55, 78, 96, 5, 47, 36};

        for (int i= 0; i< numbers.length; i++) {
            int temp;
            for(int j =i+1; j< numbers.length; j++) {
                if(numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("sorted array output: " + Arrays.toString(numbers));
        System.out.println("second small number: " + numbers[1]);
    }
}
