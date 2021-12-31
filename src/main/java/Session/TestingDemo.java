package Session;

import java.util.HashMap;
import java.util.Map;

public class TestingDemo {

    public static void main(String params[]) {
        String text = "Hello Testing team, Welcome to Testing module.";
        String[] splitter = text.split(" ");
        Map<String, Integer> countMap = new HashMap<>();
        for (int i = 0; i < splitter.length; i++) {
            if (!countMap.containsKey(splitter[i])) {
                countMap.put(splitter[i], 1);
            } else {
                countMap.put(splitter[i], countMap.get(splitter[i]) + 1);
            }
        }
        Map.Entry<String, Integer> highestCount = null;
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (highestCount == null || entry.getValue().compareTo(highestCount.getValue()) > 0) {
                highestCount = entry;
            }
        }
        System.out.println("Highest count: " + highestCount);
    }
}
