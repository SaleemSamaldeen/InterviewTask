package Programs;

import java.util.ArrayList;
import java.util.List;

public class SwapFirstAndLast {


    public static void swapFirstAndLast() {
        String text = "That was best time for learning";
        String output = "";
        List<String> swapped = new ArrayList<>();
        String[] splitted = text.split(" ");
        for (int i = 0; i < splitted.length; i++) {
            String single = splitted[i];

            // Finding string length
            int n = single.length();

            // First character of a string
            String first = String.valueOf(single.charAt(0));

            // Last character of a string
            String last = String.valueOf(single.charAt(n - 1));
            single = single.replace(String.valueOf(single.charAt(n - 1)), first);
            single = single.replaceFirst("^[a-zA-Z]", last);
            swapped.add(single);
        }

        for (int i = 0; i < swapped.size(); i++) {
            output = output.concat(swapped.get(i) + " ");
        }

        System.out.println("Swapped text: " + output);

    }

    public static void main(String args[]) {
        swapFirstAndLast();
    }
}
