import java.io.IOException;
import java.util.Scanner;


public class AddAndDelete {
	static Scanner userIntInput = new Scanner(System.in);
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException{
		System.out.println("Do you want to (1) add, or (2) delete a student?");
		int answer = scanner.nextInt();
		if(answer == 1) {
			add();
		}else if(answer == 2) {
			delete();
		}
	}


public static void add(){
	System.out.println("What is the first name of the student you would like to add?");
	String first = scanner.nextLine();
	System.out.println("What is the last name of the student you would to add?");		
	String last= scanner.nextLine();
	System.out.println("What is the student's first class?");
	String class1 = scanner.nextLine();
	System.out.println("What is their grade in that class?");
	String grade1= scanner.nextLine();
	System.out.println("What is the student's second class?");
	String class2=scanner.nextLine();
	System.out.println("What is thier grade in that class?");
	String grade2 =scanner.nextLine();
	System.out.println("What is the student's third class?");
	String class3= scanner.nextLine();
	System.out.println("What is thier grade in that class?");
	String grade3 = scanner.nextLine();
	double gpa = 4.0;
	
	StudentList.studentList.add( new Student(first, last, gpa, class1, grade1, class2, grade2, class3, grade3));
}
public static void delete() throws IOException{
	System.out.println("What student would you like to delete");
	PrintStudentNames.display();
	int gone = scanner.nextInt() -1;
	StudentList.studentList.remove(gone);
	PrintStudentNames.display();
}
}
