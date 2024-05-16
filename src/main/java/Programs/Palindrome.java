package Programs;

import java.util.Scanner;

public class Palindrome {

    public static void checkNumberIsPalindrome() {

        System.out.println("Enter number: ");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //String name = sc.nextLine();

        int temporary = number;
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        if (temporary == reverse) {
            System.out.println("Given number is palindrome");
        } else {
            System.out.println("Given number is not a palindrome");
        }
    }

    public static void checkStringIsPalindrome() {
        String name = "abba";
        String output = "";
        for(int i = name.length() -1 ; i >= 0; i--) {
           output = output + name.charAt(i);
        }
        if(output.equals(name)) {
            System.out.println("Given string is palindrome");
        } else {
            System.out.println("Given string is not palindrome");
        }
    }

    public static void main(String[] parms) {
        checkNumberIsPalindrome();
        checkStringIsPalindrome();
    }
}
