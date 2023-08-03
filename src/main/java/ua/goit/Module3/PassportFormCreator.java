package ua.goit.Module3;

import java.util.Scanner;

public class PassportFormCreator {
    public void createForms() {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = scanner.nextInt();
        age *= 10;
        System.out.println(firstName + " " + lastName + " " + age);
        System.out.println((firstName + "\n" + lastName + "\n" + age).toUpperCase());
        scanner.close();
    }

    public static void main(String[] args) {
        PassportFormCreator main = new PassportFormCreator();
        main.createForms();
    }
}
