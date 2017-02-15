import java.util.Scanner;

public class TwentyQuestions
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "TWO QUESTIONS!" );
		System.out.println( "Think of an object, and I'll try to guess it" );

		System.out.println( "Question 1) Is it animal, vegetable, or mineral?" );
		String objectType = keyboard.next();		
		
		System.out.println( "Question 2) Is it bigger than a breadbox?" );
		String objectSize = keyboard.next();

		if (objectType.equals("animal") && objectSize.equals("no"))
			System.out.println( "My guess is that you are thinking of a squirrel" );

		else if(objectType.equals("animal") && objectSize.equals("yes"))
			System.out.println( "My guess is that you are thinking of a moose" );

		else if(objectType.equals("vegetable") && objectSize.equals("yes"))
			System.out.println( "My guess is that you are thinking of a watermelon" );

		else if(objectType.equals("vegetable") && objectSize.equals("no"))
			System.out.println( "My guess is that you are thinking of a carrot" );

		else if(objectType.equals("mineral") && objectSize.equals("yes"))
			System.out.println( "My guess is that you are thinking of a camaro" );

		else if(objectType.equals("mineral") && objectSize.equals("no"))
			System.out.println( "My guess is that you are thinking of a paperclip" );

		System.out.println( "I would ask you if I'm right, but I don't actually care" );
	}

}
