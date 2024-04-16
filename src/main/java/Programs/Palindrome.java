package Programs;

import java.util.Scanner;

public class Palindrome {

    public static void checkPalindrome() {

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

    public static void main(String[] parms) {
        checkPalindrome();
        int i = 1234;   //reverse an integer
        String value = String.valueOf(i);
        StringBuffer sf = new StringBuffer(value).reverse();
        System.out.println("reverse integer: " + sf);
    }
}
