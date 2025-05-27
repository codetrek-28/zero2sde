package src; // <-- Change this to 'strings', 'trees', etc. based on the topic

import arrays.miscellaneous.EvenDigitNumbers;
import arrays.slidingWindow.MaxConsecutiveOnes;
import arrays.twoPointers.DuplicateZeros;
import arrays.twoPointers.SquaresOfASortedArray;

import java.util.*;

/**
 * Problem: <Problem Name>
 * Link: https://leetcode.com/problems/<slug>/
 *
 * Approach:
 * - Briefly explain your logic here.
 * - Mention any important patterns or techniques used.
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 */
public class BluePrintProblem { // <-- Change this to match your file name

    public int[] solve(int[] input) {
        // Your logic goes here
        return new int[] {};
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes solution = new MaxConsecutiveOnes(); // change class name here too
        int[] input = {2, 7, 11, 15};

        int result = solution.findMaxConsecutiveOnes(input);
        System.out.println("Max Consecutive Ones: " + result);

        EvenDigitNumbers evenDigitNumbers = new EvenDigitNumbers();
        int evenDigitNumbersCount = evenDigitNumbers.findNumbers(input);
        System.out.println("evenDigitNumbersCount: " + evenDigitNumbersCount);

        SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();
        int[] sortedSquares = squaresOfASortedArray.sortedSquares(input);
        System.out.println("Sorted Squares: " + Arrays.toString(sortedSquares));

        DuplicateZeros duplicateZeros = new DuplicateZeros();
        duplicateZeros.duplicateZeros(new int[] {1, 0, 2, 3, 0, 4, 5, 0});
    }
}
