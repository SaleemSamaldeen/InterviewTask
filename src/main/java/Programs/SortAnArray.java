package Programs;

import java.util.Arrays;

public class SortAnArray {

    public static void main(String[] args) {
       getSortedArray();
    }

    public static void getSortedArray() {
        int[] numbers = {1, 2, 99, 9, 8, 7, 6, 0, 5, 4, 3};
        Arrays.sort(numbers);
        System.out.println("Sorted array:" + Arrays.toString(numbers));

        for (int i=0; i<numbers.length; i++) {
            int temporary;
            for(int j = i+1; j<numbers.length;j++) {
                if(numbers[j] < numbers[i]){
                    temporary = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temporary;
                }
            }
        }
        System.out.println("Sorted array using loop: "+Arrays.toString(numbers));
    }
}
