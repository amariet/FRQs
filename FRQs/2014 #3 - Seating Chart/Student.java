/**
 * FRQ: 2014 #3
 * 
 * @Kara Herson
 * @3/7/2017
 */
public class Student
{
    private String name;
    private int absences;
    
    public Student (String n, int a)
    {
        name = n;
        absences = a;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAbsenceCount()
    {
        return absences;
    }
}
