package Programs;

import java.util.ArrayList;
import java.util.List;

public class ReplaceHello {

    public static void main(String para[]) {

        String text = "hellohellohello";
        String output = "";
        List<String> store = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            String single = String.valueOf(text.charAt(i));
            if (single.equals("e")) {
                single = "s";
            }
            if (store.contains("l")) {
                store.clear();
            } else if (single.equals("l")) {
                store.add(single);
                single = "a";
            }
            output = output + single;
        }
        System.out.println("Replaced text: " + output);

    }
}
