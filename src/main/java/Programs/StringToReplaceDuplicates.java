package Programs;

import java.util.ArrayList;
import java.util.List;

public class StringToReplaceDuplicates {

    public static void main(String args[]) {
        String name = "saleemsamaldeen";
        List<String> repeated = new ArrayList<>();
        String output = "";
        for (int i = 0; i < name.length(); i++) {
            String single = String.valueOf(name.charAt(i));
            if (repeated.contains(single)) {
                single = "";
            }
            output = output + single;
            repeated.add(single);
        }
        System.out.println("Remove duplicates in String: " + output);
    }


}
