import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo 
{
	public static void main(String[] args) 
	{

		System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
		Scanner keyboard = new Scanner(System.in);
	
		int number = keyboard.nextInt();
	
		int random = 1 + new Random().nextInt(100);

		if( number < random)
			System.out.println("Sorry, you are too low.  I was thinking of "+ random);
		else if ( number > random )
			System.out.println("Sorry, you are too high.  I was thinking of "+ random);
			
	}

}
