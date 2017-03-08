/**
 * FRQ: 2014 #3
 * 
 * @Kara Herson
 * @3/7/2017
 */

import java.util.List;
public class SeatingChart
{
    private Student[][] seats;
    
    /*Part A*/
    public SeatingChart (List<Student> studentList, int rows, int cols)
    {
        seats = new Student[rows][cols];
        int i = 0;
        int r = 0;
        int c = 0;
        while (i < studentList.size())
        {
            seats[r][c] = studentList.get(i);
            r++;
            if (r >= rows)
            {
                r = 0;
                c ++;
            }
            i++;
        }
    }
    
    /*Part B*/
    public int removeAbsentStudents (int allowedAbsences)
    {
        int numRemoved = 0;
        for (int r = 0; r < seats.length; r++)
        {
            for (int c = 0; c < seats[r].length; c++)
            {
                if (seats[r][c] != null)
                {
                    Student s = seats[r][c];
                    if (s.getAbsenceCount() > allowedAbsences)
                    {
                        seats[r][c] = null;
                        numRemoved ++;
                    }
                }
            }
        }
        return numRemoved;
    }
}
