import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormat;

public class PrintStudentNames {

	public static void display() throws IOException
	{
		
		int num = 1;
		for(int i=0; i<StudentList.studentList.size(); i++)
		{
			String number = Integer.toString(num) + ")";
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

}
