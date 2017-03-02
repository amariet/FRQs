
/**
 * Kara Herson
 * 3/1/2017
 */
import java.util.List;
import java.util.ArrayList;
public class SparseArray
{
     private int numRows;
     private int numCols;
     private List<SparseArrayEntry> entries;
    public SparseArray()
    { 
        entries = new ArrayList<SparseArrayEntry>(); 
    }
    
    public int getNumRows()
    { 
        return numRows; 
    }

    public int getNumCols()
    { 
        return numCols;
    }
    
    //Part A
    public int getValueAt(int row, int col)
    { 
        for (int i = 0; i < entries.size(); i++)
        {
            SparseArrayEntry s = entries.get(i);
            if (s.getRow() == row && s.getCol() == col)
            {
                return s.getValue();
            }
        }
        return 0;
    }
    
    //Part B
    public void removeColumn(int col)
    { 
        for (int i = 0; i < entries.size(); i++)
        {
            SparseArrayEntry s = entries.get(i);
            if(s.getCol() == col)
            {
                entries.remove(i);
            }
            else if (s.getCol() > col)
            {
                SparseArrayEntry s2 = new SparseArrayEntry (s.getRow(), s.getCol() - 1, s.getValue());
                entries.set(i, s2);
            }
        }
        numCols --;
    }
}