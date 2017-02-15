import java.util.Scanner;

public class CountingWhile
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it five times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();

		int number = 0;
		while ( number < 5 )
		{
			System.out.println( (number + 1) + ". " + message );
			number++;
		}

	}
}
