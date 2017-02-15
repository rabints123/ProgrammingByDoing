import java.util.Scanner;
import java.util.Random;

public class KeepGuessing 
{
	
	public static void main(String[] args) 
	{	

		System.out.println("I'm thinking of a number from 1 to 10. Your guess > ");
		Scanner keyboard = new Scanner(System.in);
		
		
		int guess_num, random_num = 1 + new Random().nextInt(10);
		
		do {
			guess_num = keyboard.nextInt();
	
			if ( guess_num != random_num ) {
				System.out.println("That is incorrect. Guess again.");
			
			}
			else {
				System.out.println("That's right! You're a good guesser.");
			}
		} while ( guess_num != random_num );
		 
		
	}

}
