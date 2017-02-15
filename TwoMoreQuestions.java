import java.util.Scanner;

public class TwoMoreQuestions
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "TWO MORE QUESTIONS, BABY!" );
		System.out.println( "\nThink of something and I'll try to guess it!" );
	
		System.out.println( "\nQuestion 1) Does it stay inside or outside or both?" );
		String whereLives = keyboard.next();

		System.out.println( "Question 2) Is it living thing?" );
		String isLive = keyboard.next();

		if (whereLives.equals("inside") && isLive.equals("yes"))
			System.out.println( "Then what else could you be thinking of besides a houseplant!");

		if (whereLives.equals("inside") && isLive.equals("no"))
			System.out.println( "Then what else could you be thinking of besides a shower curtain!");

		if (whereLives.equals("outside") && isLive.equals("yes"))
			System.out.println( "Then what else could you be thinking of besides a shower bison!");

		if (whereLives.equals("outside") && isLive.equals("no"))
			System.out.println( "Then what else could you be thinking of besides a shower billboard!");

		if (whereLives.equals("both") && isLive.equals("yes"))
			System.out.println( "Then what else could you be thinking of besides a shower dog!");

		if (whereLives.equals("both") && isLive.equals("no"))
			System.out.println( "Then what else could you be thinking of besides a shower cellphone!");
		
	}
}