package Programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MatchvowelsAndCount {

    public static void main(String[] args) {
        getVowelsCount("Automation Engineer");
    }

    private static void getVowelsCount(String text) {
        List<String> vowels = Arrays.asList("a", "i", "e", "o", "u");
        HashMap<String, Integer> totalCount = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            String oneLetter = Character.toString(text.charAt(i)).toLowerCase();
            if (vowels.contains(oneLetter)) {
                if (!totalCount.containsKey(oneLetter)) {
                    totalCount.put(oneLetter, 1);
                } else {
                    int updated = totalCount.get(oneLetter) + 1;
                    totalCount.replace(oneLetter, updated);
                }
            }
        }
        System.out.println(totalCount);
    }
}
