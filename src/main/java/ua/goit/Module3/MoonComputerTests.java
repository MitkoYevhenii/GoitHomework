package ua.goit.Module3;
import java.util.*;

public class MoonComputerTests {
    public void testBasicInputOutput() {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        System.out.println(inputLine);
        scanner.close();
    }

    public void testMath() {
        Scanner scanner = new Scanner(System.in);
        int intFirst = scanner.nextInt();
        int intSecond = scanner.nextInt();
        System.out.println((intFirst + intSecond) + " " + (intFirst - intSecond) + " " + (intFirst * intSecond) + " " + (intFirst / intSecond));
        scanner.close();
    }

    public void testLogicalOperators() {
        Scanner scanner = new Scanner(System.in);
        boolean firstBoolean = scanner.nextBoolean();
        boolean secondBoolean = scanner.nextBoolean();
        boolean thirdBoolean = scanner.nextBoolean();
        System.out.println((firstBoolean && secondBoolean && thirdBoolean) + " " + (firstBoolean|| secondBoolean || thirdBoolean));
        scanner.close();
    }


    //Test output on Hello Java standard input
    public static void main(String[] args) {
        MoonComputerTests computerTests = new MoonComputerTests();
    }
}
