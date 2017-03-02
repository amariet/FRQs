
/**
 * 2015 #4, Part b
 * 
 * @Kara Herson
 * @2/28/2017
 */
public class Range implements NumberGroup
{
   private int min;
   private int max;
   
   public Range (int min, int max)
   {
       this.min = min;
       this.max = max;
   }
   
   public boolean contains (int n)
   {
       return (n >= min && n <= max);
   }
}
