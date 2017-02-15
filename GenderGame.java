

import java.util.Scanner;
import java.util.regex.Pattern;

public class GenderGame 
{
	public static void main(String[] args) 
	{
	
		System.out.println("What is your gender (M or F): ");
		Scanner keyboard = new Scanner(System.in);
	
		char gender = keyboard.next().charAt(0);
		System.out.println("First name: ");
		String firstName = keyboard.next();

		System.out.println("Last name: ");
		String lastName = keyboard.next();
		
		System.out.println("Age: ");
		int age = keyboard.nextInt();
		
		if (age < 18 ) {
			System.out.println("Then I shall call you "+ lastName+".");
			System.exit(0);
		}
		if(gender == 'M') {
			System.out.println("Then I shall call you Mr. "+ lastName+".");
		}
		else  {

			System.out.println("Are you married, "+ firstName +" (y or n)? ");
			char maritalStatus = keyboard.next().charAt(0);

			if( maritalStatus == 'y' ) {
				System.out.println("Then I shall call you Mrs. "+ lastName +".");
			}
			else  {
				System.out.println("Then I shall call you Ms. "+ lastName+".");
			}

		}
	}

}
