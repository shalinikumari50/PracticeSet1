package question8;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gender = scanner.next().trim();
        int age = scanner.nextInt();
        if (gender.equals("female")) {
            if (age >= 1 && age <= 58) {
                System.out.println("8.2%");
            } else if (age >= 59 && age <= 100) {
                System.out.println("9.2%");
            }
        }
        if (gender.equals("male")) {
            if (age >= 1 && age <= 58) {
                System.out.println("8.4%");
            } else if (age >= 59 && age <= 100) {
                System.out.println("10.5%");
            }
        }

        scanner.close();
    }

}
