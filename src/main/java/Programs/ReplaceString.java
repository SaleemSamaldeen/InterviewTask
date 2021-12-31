package Programs;

import java.io.IOException;

public class ReplaceString {

    private static String output = "";

    public static void convertToUpperCase(String username) throws IOException {
        for (int i = 0; i < username.length(); i++) {
            Character letter = username.charAt(i);
            if (letter.equals("a")) {
                letter = Character.toUpperCase(letter);
                Character.isUpperCase(letter);
            }
            output = output + letter;

        }
        if (username.contains("a")) {
            System.out.println("Replacing a with symbol: " + username.replace("a", "$"));
        }
        System.out.println("UppercaseCheck: " + output);
    }

    public static void main(String[] params) throws IOException {
        convertToUpperCase("saleem");
    }
}
