package question12;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int c = 1;
        for (int i = 2; i < (int) (Math.sqrt(number)) + 1; i++) {
            if (number % i == 0) {
                c = 0;
                break;
            }

        }
        if (number == 1 || c == 0) {
            System.out.println(number + " is not a prime number");
        } else {
            System.out.println(number + " is a prime number");
        }

        scanner.close();
    }
}
