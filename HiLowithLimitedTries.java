import java.util.Random;
import java.util.Scanner;

public class HiLowithLimitedTries 
{
	
	public static void main(String[] args) 
	{

		int random = 1 + new Random().nextInt(10);
		System.out.println("I'm thinking of a number from 1 to 100.\nYou have 7 guess: ");
		
		Scanner keyboard = new Scanner(System.in);
		int number = 1;
		
		while( number <= 7 ) {
			
			System.out.println("Your guess : " + number); 
			number++;
			int guess_num = keyboard.nextInt();
				
			if ( guess_num == random ) {
					System.out.println("You guessed it!  What are the odds?!? ");
				}
		}
		 	
	}
}
