package Programs;

import java.util.ArrayList;
import java.util.List;

public class AddNumbersList {

    /* Replace every element with addition of previous and next element */

    /* For first and last index, add accordingly---  */

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList();
        List<Integer> output = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        int sum;

        sum = numbers.get(0) + numbers.get(1);
        output.add(sum);
        for (int i = 1; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                sum = numbers.get(i) + numbers.get(i - 1);
                output.add(sum);
            } else {
                sum = numbers.get(i + 1) + numbers.get(i - 1);
                output.add(sum);
            }
        }
        System.out.println(output);
    }
}
