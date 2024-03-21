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
				
			}
		public static void changeGrade(int num, int period, String grade)throws IOException
		{
			if(period==1)
			{
				StudentList.studentList.get(num).setFirstGrade(grade);
				System.out.println(StudentList.studentList.get(num).getFirstGrade());
				int num1 = 1;
				for(int i=0; i<StudentList.studentList.size(); i++)
				{
					String number = Integer.toString(num1) + ")";
					String name = StudentList.studentList.get(i).getFirstName() + " "+ StudentList.studentList.get(i).getLastName();
					DecimalFormat d = new DecimalFormat("0.00");
				    String gpa = d.format(StudentList.studentList.get(i).getGpa()); 
					String firstClass = StudentList.studentList.get(i).getFirstClass();
					String firstGrade = StudentList.studentList.get(i).getFirstGrade();
					String secondClass = StudentList.studentList.get(i).getSecondClass();
					String secondGrade = StudentList.studentList.get(i).getSecondGrade();
					String thirdClass = StudentList.studentList.get(i).getThirdClass();
					String thirdGrade = StudentList.studentList.get(i).getThirdGrade();
					
					System.out.printf("%-3s %-17s %-5s %-7s %-5s %-7s %-5s %-7s %-5s", number,name,gpa,firstClass,firstGrade,secondClass,secondGrade,thirdClass,thirdGrade);
					System.out.println();
					num++;
				}
			}
			else if(period==2)
			{
				StudentList.studentList.get(num).setSecondGrade(grade);
			}
			else
			{
				StudentList.studentList.get(num).setThirdGrade(grade);
			}
			
			
		}
//				public static changeGrade( int number, int classPeriod, String newGrade)
//				{
//					//for(int i = 0; i < StudentList.studentList.get())
//					//
//					if(StudentList.getFirstClass.equals(firstClass))
//						{
//							studentList.setFirstGrade(newGrade);
//						}
//					else if(StudentList.getSecondClass.equals(secondClass))
//						{
//							studentList.setSecondGrade(newGrade);
//						}
//					else if(StudentList.getThirdClass.equals(thirdClass))
//						{
//							studentList.setThirdGrade(newGrade);
//						}
//					
//					System.out.println(firstName + lastName + "'s grade has been changed.");
//
//				}
				

	}
