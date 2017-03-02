/**
 * 2015 #4, Part c
 * 
 * @Kara Herson
 * @2/28/2017
 */
import java.util.*;
public class MultipleGroups implements NumberGroup
{
    private List<NumberGroup> groupList;
    
    public boolean contains (int num)
    {
        for (int i = 0; i < groupList.size(); i++)
        {
            if (groupList.get(i).contains(num))
            {
                return true;
            }
        }
        return false;
    }
}
