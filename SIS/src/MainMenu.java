import java.io.IOException;
import java.util.Scanner;
import java.io.IOException;

public class MainMenu {

	public static void main(String[] args) throws IOException
	{

		System.out.println("What you you like to do?");
		System.out.println("1) add or delete a student");
		System.out.println("2) change student grades/schedule");
		System.out.println("3) sort students");
		Scanner userInput = new Scanner(System.in);
		int option = userInput.nextInt();
 
		if(option == 1)
		{
			System.out.println(1);
		}
		else if(option == 2)
		{
			System.out.println(2);
		}
		else if(option == 3)
		{
			Sort.run();
		}

	}

}
