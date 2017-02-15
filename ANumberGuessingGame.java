import java.util.Scanner;
import java.util.Random;

public class ANumberGuessingGame 
{
	public static void main(String[] args) 
	{	

		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("I'm thinking of a number from 1 to 10.\nYour guess: ");
		int guess = keyboard.nextInt();

		int real = 1 + new Random().nextInt(10);

		if ( guess != real ) {
			System.out.println("Sorry, but I was really thinking of "+ real );
		}
		else {
			System.out.println("That's right!  My secret number was "+ guess);
		}
		 
		
	}

}
