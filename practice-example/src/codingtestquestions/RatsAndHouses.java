package codingtestquestions;

/*
Problem Description :
The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its argument
‘r’ represents the number of rats present in an area, ‘unit’ is the amount of food each rat consumes and each ith
element of array ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i

Note:
Return -1 if the array is null
Return 0 if the total amount of food from all houses is not sufficient for all the rats.
Computed values lie within the integer range.

 */

import java.util.Scanner;

public class RatsAndHouses {
    public static int distributeFood(int r, int unit, int[] arr) {
        // Check if the input array is null
        if (arr == null) {
            return -1;
        }

        // Calculate the total amount of food in all houses
        int totalFood = 0;
        for (int i = 0; i < arr.length; i++) {
            totalFood += arr[i];
        }

        // Check if the total food is sufficient for all rats
        if (totalFood < r * unit) {
            return 0;
        }

        // Initialize variables to keep track of the distributed food and remaining rats
        int distributedFood = 0;
        int remainingRats = r;

        // Distribute food to each house
        for (int i = 0; i < arr.length; i++) {
            if (remainingRats == 0) {
                break; // No more rats to feed
            }

            if (arr[i] >= unit) {
                // If the house has enough food for one rat, distribute it
                distributedFood += unit;
                remainingRats--;
            } else {
                // If the house has less food than required, distribute all the available food
                distributedFood += arr[i];
            }
        }

        return distributedFood;
    }

    public static void main(String[] args) {
        int r = 5; // Number of rats
        int unit = 2; // Amount of food each rat consumes
        int[] arr = {4, 2, 6, 8, 5}; // Amount of food in each house

        int result = distributeFood(r, unit, arr);

        if (result == -1) {
            System.out.println("Input array is null.");
        } else if (result == 0) {
            System.out.println("Total food is not sufficient for all rats.");
        } else {
            System.out.println("Total distributed food: " + result);
        }
    }
}

