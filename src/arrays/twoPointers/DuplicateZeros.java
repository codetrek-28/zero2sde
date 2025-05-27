package arrays.twoPointers; // <-- Change this to 'strings', 'trees', etc. based on the topic

import arrays.miscellaneous.EvenDigitNumbers;
import arrays.slidingWindow.MaxConsecutiveOnes;

import java.util.Arrays;

/**
 * Problem: Duplicate Zeros in an Array
 * Link: https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
 *
 * Approach:
 * - Look for element that is zero. If element is zero loop from the end until the before index and move each passing element
 * to the right.
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 */
public class DuplicateZeros {

    public int[] bruteForceSolution(int[] arr)
    {
        int n = arr.length;
        // This problem took a while for me to understand and code the solution. This could be for various reasons because I may not concentrate enough.
        for (int i= n-1; i>=0 ; i--)
        {
            if (arr[i] == 0 && i+1 <= n-1) // I missed the condition of i+1 <= n-1, Instead I was writing to access the arr[i + 1] which throw index out of bound error
            {
                for (int j = n -1; j > i ; j--) // Even here I missed the condition of j > i instead using j < 1 which is never true.
                {
                    arr[j] = arr[j-1];
                }
                arr[i+1] = 0;
            }
        }
        return arr;
    }

    public int[] duplicateZeros(int[] arr)
    {
        int i = 0;
        int j = 0;

        while (j < arr.length)
        {
            j = arr[i] == 0 ? j + 2 : j + 1;
            i ++;
        }
        System.out.println("Value of i " + i);
        System.out.println("Value of j " + j);

        i = i - 1;
        j = j - 1;

        // So we have a I value and J value now backtrace and move elements for shifting
//        while (i >= 0)
//        {
//            for (j = n-1; j> i ; j --)
//            {
//                if ()
//            }
//
//        }
//        while (j > 0)
//        {
//            for (int i ; i>=0 ; i--)
//            {
//
//            }
//        }
        return arr;

    }

    public int[] solve(int[] input) {
        // Your logic goes here
        return new int[] {};
    }
}
