package Programs;

import java.util.Scanner;

public class Palindrome {

    public static void checkPalindrome() {

        System.out.println("Enter number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //String name = sc.nextLine();

        int temp = num;
        int rev = 0;
        while (num != 0) {
            int remainder = num % 10;
            rev = rev * 10 + remainder;
            num = num / 10;
        }
        if (temp == rev) {
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
