import java.io.IOException;
import java.util.Scanner;
import java.io.IOException;

public class MainMenu {

	public static void main(String[] args) throws IOException
	{
		boolean continueChanging = true;
		StudentList.fillArray();
		while(continueChanging)
		{
		System.out.println("What you you like to do?");
		System.out.println("1) add or delete a student");
		System.out.println("2) change student grades/schedule");
		System.out.println("3) sort students");
		Scanner userInput = new Scanner(System.in);
		int option = userInput.nextInt();
 
		if(option == 1)
		{
			AddAndDelete.run();
		}
		else if(option == 2)
		{
			System.out.println("Would you like to change (1)grades or (2)schedule?");
			Scanner userInput1 = new Scanner(System.in);
			int option1 = userInput1.nextInt();
			if(option1==1)
			{
				Grade.change();
			}
			else
			{
				SwitchClass.switchClass();
			}
			
		}
		else if(option == 3)
		{
			Sort.run();
		}
		
		System.out.println();
		System.out.println("Do you want to continue changing the roster (1)yes and (2)no?");
		int cont = userInput.nextInt();
		if(cont==2)
		{
			continueChanging = false;
		}
		}
		

	}

}
