package ua.goit.Module3;

import java.util.Arrays;
import java.util.Scanner;

public class SaveStarShip {
    public int calculateDistance(int distance) {
        return Math.abs(distance);
    }

    public String[] getPlanets(String galaxy) {
        if (galaxy.equals("Miaru")) {
            return new String[]{"Maux", "Reux", "Piax"};

        } if (galaxy.equals("Milkyway")) {
            return new String[]{"Earth", "Mars", "Jupiter"};

        } if (galaxy.equals("DangerBanger")) {
            return new String[]{"Fobius", "Demius"};

        } else {
            return new String[]{};
        }
    }

    public String choosePlanet(long distanceToEarth) {
        if (distanceToEarth < 45677) {
            return "Earth";
        } else {
            return "Pern";
        }
    }

    public int calculateFuelPrice(String fuel, int count) {

         if (fuel.equals("STAR100")) {
             return 70 * count;

         } if (fuel.equals("STAR500")) {
             return 120 * count;

        } if (fuel.equals("STAR1000")) {
             return 200 * count;

        } else {
             return  50 * count;
        }
    }

    public int roundSpeed(int speed) {
        return Math.round(speed / 10.0f) * 10;
    }

    public int calculateNeededFuel(int distance) {
        if (distance <= 20) {
             return 1000;
        } else {
            return 1000 + (distance - 20) * 5;
        }
    }

    public void calculateMaxPower() {
        Scanner scanner = new Scanner(System.in);
        double power1 = scanner.nextFloat();
        double power2 = scanner.nextFloat();
        double power3 = scanner.nextFloat();
        scanner.close();
        double[] numbers = {power1, power2, power3};

        float maxPower = (float) Arrays.stream(numbers).max().orElse(Float.NEGATIVE_INFINITY);

        if (maxPower < 10) {
            System.out.println(maxPower * 0.7f);
        } if (10 <= maxPower &&	 maxPower <= 100) {
            System.out.println(maxPower * 1.2f);
        } if (maxPower >= 100) {
            System.out.println(maxPower * 2.1f);
        }
    }

    public String getMyPrizes(int ticket) {
        String prise = "";
        if (ticket % 10 == 0) {
            prise = String.join("", prise, "crystall ");
        } if (ticket % 10 == 7) {
            prise = String.join("",  prise, "chip ");
        } if (ticket > 200) {
            prise = String.join("", prise, "coin ");
        }
        return prise;
    }

    public boolean isHangarOk(int side1, int side2, int price) {
        return side1 * side2 >= 1500 && Math.max(side1, side2) <= 2*Math.min(side1, side2) && price / (side1 * side2) <= 1000;
    }

    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();
        System.out.println(ship.isHangarOk(100, 75, 10000));
    }
}