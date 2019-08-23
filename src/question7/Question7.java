package question7;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char value = scanner.nextLine().trim().charAt(0);
        if (Character.isLetter(value)) {
            System.out.println("alphabet");
        } else if (Character.isDigit(value)) {
            System.out.println("digit");
        } else {
            System.out.println("special character");
        }

        scanner.close();
    }
}
