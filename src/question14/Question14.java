package question14;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int copyOfNum = number;
        int reverse = 0;
        int digit;
        while (number > 0) {
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        if (copyOfNum == reverse) {
            System.out.println(copyOfNum + " is a palindrome");
        } else {
            System.out.println(copyOfNum + " is not a palindrome");
        }
        scanner.close();
    }
}
