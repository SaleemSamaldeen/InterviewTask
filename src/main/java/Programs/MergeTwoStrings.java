package Programs;

public class MergeTwoStrings {
    public static void main(String[] args) {
        mergeStrings("hello", "world");
    }

    private static void mergeStrings(String one, String two) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < one.length() || i < two.length(); i++) {
            if (i < one.length())
                result.append(one.charAt(i));
            if (i < two.length())
                result.append(two.charAt(i));
        }
        System.out.println(result);
    }
}
