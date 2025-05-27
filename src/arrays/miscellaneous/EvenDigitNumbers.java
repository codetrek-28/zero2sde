package arrays.miscellaneous;

public class EvenDigitNumbers {

    public int findNumbers(int[] nums) {
        int evenDigitsCount = 0;
        for (int num : nums)
        {
            // Loop through each number in the array
            int loopCount = 0;
            while(true)
            {
                loopCount++;
                num = num/10;
                if (num == 0.0)
                    break;
            }

            if (loopCount %2 == 0.0)
                evenDigitsCount ++;
        }
        return evenDigitsCount;
    }
}
