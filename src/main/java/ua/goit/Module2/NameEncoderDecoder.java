package ua.goit.Module2;


import java.util.Random;

public class NameEncoderDecoder {
    public static void main(String[] args) {
        int age = getRandomInt();

        System.out.println("Age: " + age);

        if (age >= 18) {
            System.out.println("Join if statement");
            System.out.println("Show all news");
        } else if (age >= 14){
            System.out.println("Join else statement");
            System.out.println("Show all  news for kids");
            System.out.println("New displayed");
        } else {
            System.out.println("We will not display news");
        }

        System.out.println("New displayed");
    }

    public static int getRandomInt() {
        Random random = new Random();
        return random.nextInt(19, 21);
    }
}