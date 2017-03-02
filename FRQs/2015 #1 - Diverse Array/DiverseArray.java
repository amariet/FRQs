
/**
 * 2015 FRQ #4
 * 
 * @Kara Herson
 * @2/28/2017
 */
public class DiverseArray
{
    //part a
    public static int arraySum (int[]arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }
        return sum;
    }
    
    //part b
    public static int[] rowSums (int[][] arr2D)
    {
        int[] sums = new int[arr2D.length];
        for (int r = 0; r < sums.length; r++)
        {
            sums[r] = arraySum (arr2D[r]);
        }
        return sums;
    }
    
    //part c
    public static boolean isDiverse (int[][] arr2D)
    {
        int[] sums = rowSums(arr2D);
        for (int i = 0; i < sums.length; i++)
        {
            for (int j = i + 1; j < sums.length; j++)
            {
                if (sums[i] == sums[j])
                {
                    return false;
                }
            }
        }
        return true;
    }
}

