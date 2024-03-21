import java.io.File;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class StudentList {
	static ArrayList<Student> studentList = new ArrayList<>();
	
    public static void fillArray() throws IOException
    {

    	Scanner studentFile = new Scanner(new File("studentlist.txt"));
    	while(studentFile.hasNext())
    	{
    	String firstName = studentFile.next();
    	String lastName = studentFile.next();
    	String firstClass = studentFile.next();
    	String firstGrade = studentFile.next();
    	String secondClass = studentFile.next();
    	String secondGrade = studentFile.next();
    	String thirdClass = studentFile.next();
    	String thirdGrade = studentFile.next();
    	String count = getGPA(firstGrade, secondGrade, thirdGrade) ;
    	double gpa = Double.parseDouble(count);
    	studentList.add(new Student  (firstName, lastName, gpa,  firstClass ,  firstGrade ,  secondClass ,  secondGrade ,  thirdClass ,  thirdGrade )); 
    	}
    }


	public static String getGPA(String firstGrade, String secondGrade, String thirdGrade)
    {
    	double first = 0;
    	if(firstGrade.equals("A+"))
    	{
    		first = 4.3;
    	}
    	else if(firstGrade.equals("A"))
    	{
    		first = 4.0;
    	}
    	else if(firstGrade.equals("A-"))
    	{
    		first = 3.7;
    	}
    	else if(firstGrade.equals("B+"))
    	{
    		first = 3.3;
    	}
    	else if(firstGrade.equals("B"))
    	{
    		first = 3.0;
    	}
    	else if(firstGrade.equals("B-"))
    	{
    		first = 2.7;
    	}
    	else if(firstGrade.equals("C+"))
    	{
    		first = 2.3;
    	}
    	else if(firstGrade.equals("C"))
    	{
    		first = 2.0;
    	}
    	else if(firstGrade.equals("C-"))
    	{
    		first = 1.7;
    	}
    	else if(firstGrade.equals("D+"))
    	{
    		first = 1.3;
    	}
    	else if(firstGrade.equals("D"))
    	{
    		first = 1.0;
    	}
    	else if(firstGrade.equals("D-"))
    	{
    		first = 0.7;
    	}
    	else
    	{
    		first = 0;
    	}
    	
    	double second = 0;
    	if(secondGrade.equals("A+"))
    	{
    		second = 4.3;
    	}
    	else if(secondGrade.equals("A"))
    	{
    		second = 4.0;
    	}
    	else if(secondGrade.equals("A-"))
    	{
    		second = 3.7;
    	}
    	else if(secondGrade.equals("B+"))
    	{
    		second = 3.3;
    	}
    	else if(secondGrade.equals("B"))
    	{
    		second = 3.0;
    	}
    	else if(secondGrade.equals("B-"))
    	{
    		second = 2.7;
    	}
    	else if(secondGrade.equals("C+"))
    	{
    		second = 2.3;
    	}
    	else if(secondGrade.equals("C"))
    	{
    		second = 2.0;
    	}
    	else if(secondGrade.equals("C-"))
    	{
    		second = 1.7;
    	}
    	else if(secondGrade.equals("D+"))
    	{
    		second = 1.3;
    	}
    	else if(secondGrade.equals("D"))
    	{
    		second = 1.0;
    	}
    	else if(secondGrade.equals("D-"))
    	{
    		second = 0.7;
    	}
    	else
    	{
    		second = 0;
    	}
    	
    	double third = 0;
    	if(thirdGrade.equals("A+"))
    	{
    		third = 4.3;
    	}
    	else if(thirdGrade.equals("A"))
    	{
    		third = 4.0;
    	}
    	else if(thirdGrade.equals("A-"))
    	{
    		third = 3.7;
    	}
    	else if(thirdGrade.equals("B+"))
    	{
    		third = 3.3;
    	}
    	else if(thirdGrade.equals("B"))
    	{
    		third = 3.0;
    	}
    	else if(thirdGrade.equals("B-"))
    	{
    		third = 2.7;
    	}
    	else if(thirdGrade.equals("C+"))
    	{
    		third = 2.3;
    	}
    	else if(thirdGrade.equals("C"))
    	{
    		third = 2.0;
    	}
    	else if(thirdGrade.equals("C-"))
    	{
    		third = 1.7;
    	}
    	else if(thirdGrade.equals("D+"))
    	{
    		third = 1.3;
    	}
    	else if(thirdGrade.equals("D"))
    	{
    		third = 1.0;
    	}
    	else if(thirdGrade.equals("D-"))
    	{
    		third = 0.7;
    	}
    	else
    	{
    		third = 0;
    	}
    	
    	double count = first+second+third;
    	count /= 3;
    	DecimalFormat d = new DecimalFormat("0.00");
       String gpa = d.format(count); 

    	
    	return gpa;
    }
    
	
}
