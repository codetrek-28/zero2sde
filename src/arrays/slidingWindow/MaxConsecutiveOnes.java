package arrays.slidingWindow;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int currentCount = 0, maxCount = 0;
        // Time complexity o(n) // Space Complexity o(2) since two variables are used
        for (int num : nums)
        {
            if (num == 1)
                currentCount += 1;
            else
            {
                if (currentCount > maxCount)
                    maxCount = currentCount;
                currentCount = 0;
            }
        }

        if (currentCount > maxCount)
            maxCount = currentCount;

        return maxCount;
    }

}
