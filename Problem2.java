import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction; 

public class Solution {

    private int Id;
    public final int getId()
    {
        return Id;
    }
    public final void setId(int value)
    {
        Id = value;
    }
    private String FirstName;
    public final String getFirstName()
    {
        return FirstName;
    }
    public final void setFirstName(String value)
    {
        FirstName = value;
    }
    private Float CGPA = new Float(0);
    public final Float getCGPA()
    {
        return CGPA;
    }
    public final void setCGPA(Float value)
    {
        CGPA = value;
    }
    
    public static void main(String[] args) 
    {
        ArrayList<Solution> students = new ArrayList<Solution>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        
        while(sc.hasNextLine()){
            String[] text = (sc.nextLine()).split(" ");
            Solution tempVar = new Solution();
            tempVar.setId(Integer.parseInt(text[0]));
            tempVar.setFirstName(text[1]);
            tempVar.setCGPA(Float.parseFloat(text[2]) * -1); //to sort descending order easily 
            students.add(tempVar);
        }

        students.sort(
  Comparator.comparing(Solution::getCGPA).thenComparing(Solution::getFirstName).thenComparing(Solution::getId)
);

        for (Solution item : students)
        {
            System.out.println(item.FirstName);
        }
    }
}
