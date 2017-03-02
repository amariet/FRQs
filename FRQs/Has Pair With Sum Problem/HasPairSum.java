/**
 * Determines if the given array (sorted and unsorted) has a pair of integers
 * that add up to a specified sum. 
 * 
 * Precondition: all integers are positive
 * 
 * @Kara Herson
 * @3/1/2017
 */
public class HasPairSum
{
    public boolean hasPairWithSumSorted (int [] arr, int sum)
    {
        int front = 0;
        int back = arr.length-1;
        while (front < back)
        {
            int testSum = arr[front] + arr[back];
            if (testSum == sum)
            {
                return true;
            }
            else if (testSum > sum)
            {
                back --;
            }
            else {
                front ++;
            }
        }
        return false;
    }
    
    public boolean hasPairWithSumUnsorted (int [] arr, int sum)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] <= sum)
            {
                for (int j = i+1; j < arr.length; j++)
                {
                    if (arr[i] + arr[j] == sum)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean hasPairUnsorted (int[] arr, int sum)
    {
        int [] addends = new int [sum + 1];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] <= sum)
            {
                
            }
        }
        return false;
        /**
         * create a list of addends,
         * change value of addend list to one when an addend is found
         * check to see if addend complement spot in addends list is greater than 0
         * 
         */
    }
}