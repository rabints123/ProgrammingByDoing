
import java.util.Scanner;

public class TheWorstNumberGuessingGameEver 
{
	public static void main(String[] args) 
	{

		int secret_num = 4;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("TEH WORST NUBMER GESSING GAME EVAR!!!!!!!1!");
		System.out.println("I\"M THKING OF A NBR FROM 1-10.  TRY 2 GESS! ");		
		int guess_num = keyboard.nextInt();

		if (guess_num != secret_num) {
			System.out.println("W00T!  U SUX0R!!!  I PWN J00!!!  IT WAS "+secret_num+"!");
		} else  {
			System.out.println("LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS 4!");
		}
	}

}
