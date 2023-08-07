package ua.goit.Module3;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class HarekDataMaker {
    public String aggregateSingle(String name, String age, String planet) {
        return "name - " + name + ", " + "age - " + age + ", " + "planet - " + planet;
    }

    public String[] aggregateAll(String[] names, int[] ages, String[] planets) {
        return new String[]{
                aggregateSingle(names[0], String.valueOf(ages[0]), planets[0]),
                aggregateSingle(names[1], String.valueOf(ages[1]), planets[1]),
                aggregateSingle(names[2], String.valueOf(ages[2]), planets[2]),
        };
    }

    public static void main(String[] args) {

    }
}
