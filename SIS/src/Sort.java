import java.util.Collections;
import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;

public class Sort {
	
	public static void run() throws IOException
	{
		System.out.println("How would you like to sort the students?");
		System.out.println("1) sort by last name");
		System.out.println("2) sort by GPA");
		System.out.println("3) sort by period");
		Scanner userInput = new Scanner(System.in);
		int option = userInput.nextInt();
		
		if(option == 1)
		{
			Collections.sort(StudentList.studentList, new NameSorter());
			PrintStudentNames.display2();
		}
		else if(option == 2)
		{
			Collections.sort(StudentList.studentList, new GPASorter());
			PrintStudentNames.display2();
		}
		else if(option == 3)
		{
			System.out.println("What period would you like to sort?");
			Scanner userInput1 = new Scanner(System.in);
			int period = userInput1.nextInt();
			if(period ==1)
			{
				Collections.sort(StudentList.studentList, new PeriodOneSorter());
			}
			else if(period==2)
			{
				Collections.sort(StudentList.studentList, new PeriodTwoSorter());
			}
			else if(period==3)
			{
				Collections.sort(StudentList.studentList, new PeriodThreeSorter());
			}
			PrintStudentNames.display2();
		}
	}
	


}
