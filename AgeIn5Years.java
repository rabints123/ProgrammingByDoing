import java.util.Scanner;


public class AgeIn5Years
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String yourName;
		int yourAge;

		System.out.print( "Hello. What is your name? " );
		yourName = keyboard.next();
		
		System.out.print( "\nHi, " + yourName + "! How old are you? " );
		yourAge = keyboard.nextInt();

		System.out.println( "\nDid you know that in five years you will be " + (yourAge + 5) + " years old?" );
		System.out.println( "And five years ago you were " + (yourAge - 5) + "! Imagine that!");
	}
}