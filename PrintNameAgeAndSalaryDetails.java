import java.util.Scanner;

public class PrintNameAgeAndSalaryDetails
{
	public static void main(String[] args)
	{
		String myName;
		int myAge;
		double mySalary;

		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Hello. What is your name?" );
		myName = keyboard.next();

		System.out.println( "\nHi, " + myName + "! How old are you?" );
		myAge = keyboard.nextInt();

		System.out.println( "\nSo you're " + myAge + ", eh? That's not old at all!" );
		System.out.println( "How much do you make, " + myName + "?" );
		mySalary = keyboard.nextDouble();

		System.out.println( "\n" + mySalary + "! I hope that's your per hour not per year! LOL!" );

	}
}