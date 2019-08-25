package question9;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char value = scanner.nextLine().trim().charAt(0);
        if (Character.isLowerCase(value)) {
            System.out.println(Character.toUpperCase(value));
        } else {
            System.out.println(Character.toLowerCase(value));
        }

        scanner.close();
    }
}
