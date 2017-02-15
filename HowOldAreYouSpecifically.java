
import java.util.Scanner;

public class HowOldAreYouSpecifically {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println( "Hello.  What is your name? (Sorry, I keep forgetting.)" ); 
		String name = keyboard.nextLine();

		System.out.println("Hi, "+name+"!  How old are you? ");
		int age = keyboard.nextInt();
		
		if (age < 16)
			System.out.println( "You can't drive, "+name+"." );
	
		else if (age < 18) 
			System.out.println("You can drive but not vote."+name+".");
		
		else if (age < 25) 
			System.out.println("You can vote but not rent a car. "+name+".");

		else 
			System.out.println("You can do pretty much anything."+name+".");

	}
}
