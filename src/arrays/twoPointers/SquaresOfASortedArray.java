package arrays.twoPointers;

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
public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] nums) {
        int numsLength = nums.length;
        int left = 0;
        int right = numsLength -1;

        int[] result = new int[numsLength];
        int resultIndex = numsLength - 1; // Result index is chosen to be end of the list because of the sorted array

        // Loop through all the elements
        while(left <= right)
        {
            if (Math.abs(nums[left]) > Math.abs(nums[right]))
            {
                result[resultIndex] = nums[left] * nums[left];
                left ++;
            }
            else
            {
                result[resultIndex] = nums[right] * nums[right];
                right --;
            }
            resultIndex --;

        }
        return result;

    }

}
