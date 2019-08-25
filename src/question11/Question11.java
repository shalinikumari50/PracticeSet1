package question11;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        for (int i = number1; i <= number2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }

        scanner.close();
    }
}
