package ua.goit.Experiments;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        //---------------------Generation randoms numbers---------------------//
        long startTime = System.currentTimeMillis();
        int[] arr = main.randomIntArray(100_000, 0, 100_000_0);
        long endTime = System.currentTimeMillis();
        System.out.println("Time generation numbers: " + (endTime - startTime) + " milliseconds");

        //---------------------Bubble - sort---------------------//
        startTime = System.currentTimeMillis();
        int[] arrBubbleSort = bubbleSort(arr);
        endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(arrBubbleSort));
        System.out.println("Time bubble sort: " + (endTime - startTime) + " milliseconds");

        //---------------------Tim - sort---------------------//
        int[] arrTimSort = Arrays.copyOf(arr, arr.length);
        startTime = System.currentTimeMillis();
        Arrays.sort(arrTimSort);
        endTime = System.currentTimeMillis();
//        System.out.println(Arrays.toString(arrTimSort));
        System.out.println("Time Tim-sort sort: " + (endTime - startTime) + " milliseconds");
    }


    public int[] randomIntArray(int amountNumbers, int minNumbers, int maxNumbers) {
        Random random = new Random();
        int[] randomArray = new int[amountNumbers];

        for (int i = 0; i < amountNumbers; i++) {
            randomArray[i] = random.nextInt(maxNumbers - minNumbers + 1) + minNumbers;
        }
        return randomArray;
    }


    //---------------------Timsort---------------------//

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
        return arr;
    }
}
