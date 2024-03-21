import java.io.IOException;

public class PrintStudentNames {

	public static void display() throws IOException
	{
		StudentList.fillArray();
		int num = 1;
		for(Student s : StudentList.studentList) {
			System.out.println( num + ") " + s.getFirstName() + " " + s.getLastName());
			num++;
		}
		
	}

}
