import java.util.Scanner; 
import java.io.IOException;
import java.text.DecimalFormat;
import java.io.File;
public class Grade
	{

		public static void change() throws IOException
			{
				
				Scanner scanner = new Scanner(System.in);
				System.out.println("What is the number of the student you are trying to update?");
				PrintStudentNames.display();
				int number1 = scanner.nextInt();
				System.out.println("Is it the students (1)first class, (2)second class, or (3)third class?");
				int classPeriod = scanner.nextInt();
				Scanner scanner1 = new Scanner(System.in);
				System.out.println("What do you want to change the grade to?");
				String newGrade = scanner1.nextLine();
				changeGrade(number1,classPeriod,newGrade);
				PrintStudentNames.display();
				
			}
		public static void changeGrade(int num, int period, String grade)throws IOException
		{
			if(period==1)
			{
				StudentList.studentList.get(num-1).setFirstGrade(grade);
			}
			else if(period==2)
			{
				StudentList.studentList.get(num-1).setSecondGrade(grade);
			}
			else
			{
				StudentList.studentList.get(num-1).setThirdGrade(grade);
			}
				
		}

				

	}
