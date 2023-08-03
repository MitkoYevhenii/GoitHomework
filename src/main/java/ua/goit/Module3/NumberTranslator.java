package ua.goit.Module3;

public class NumberTranslator {
    public int translate(String romanNumber) {
        romanNumber = romanNumber.trim().replace(" ", "").toUpperCase();
        switch (romanNumber) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            case "XI":
                return 11;
            case "XII":
                return 12;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        NumberTranslator numberTranslator = new NumberTranslator();

        System.out.println(numberTranslator.translate("I"));    // Виведе: 1
        System.out.println(numberTranslator.translate(" X I")); // Виведе: 11
        System.out.println(numberTranslator.translate("iX "));  // Виведе: 9
        System.out.println(numberTranslator.translate("XX"));   // Виведе: -1
    }
}