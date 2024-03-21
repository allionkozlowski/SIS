import java.util.Scanner; 
import java.io.IOException;
import java.io.File;
public class Grade
	{

		public static void change() throws IOException
			{
				StudentList.fillArray();
				//change grade 
				Scanner scanner = new Scanner(System.in);
				System.out.println("What is the number of the student you are trying to update?")
				int number = scanner.nextInt();
				System.out.println("Is it the students first class, second class, or third class?");
				int classPeriod = scanner.nextInt();
				System.out.println("What do you want to change the grade to?");
				String newGrade = scanner.nextLine();
				
				public static changeGrade( int number, int classPeriod, String newGrade)
				{
					//for(int i = 0; i < StudentList.studentList.get())
					//
					if(StudentList.getFirstClass.equals(firstClass))
						{
							studentList.setFirstGrade(newGrade);
						}
					else if(StudentList.getSecondClass.equals(secondClass))
						{
							studentList.setSecondGrade(newGrade);
						}
					else if(StudentList.getThirdClass.equals(thirdClass))
						{
							studentList.setThirdGrade(newGrade);
						}
					
					System.out.println(firstName + lastName + "'s grade has been changed.");

				}
				
			}

	}
