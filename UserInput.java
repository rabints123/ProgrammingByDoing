import java.util.Scanner;

public class UserInput
{
	public static void main(String[] args)
	{
		String firstName, lastName;
		int grade;
		int studentId;
		String loginName;
		double gPA;
	
		Scanner keyboard = new Scanner(System.in);

		System.out.print( "First Name: ");
		firstName = keyboard .next();

		System.out.print( "Last Name: ");
		lastName = keyboard .next();
		
		System.out.print( "Grade (9-12): " );
		grade = keyboard .nextInt();

		System.out.print( "Student ID: ");
		studentId = keyboard .nextInt();

		System.out.print( "Login: ");
		loginName = keyboard .next();

		System.out.print( "GPA: (0.0-4.0)");
		gPA = keyboard .nextDouble();

		System.out.println( "Your INformation:" );
		System.out.println( "\tLogin: " + loginName);
		System.out.println( "\tID:    " + studentId);
		System.out.println( "\tName:  " + lastName + ", " + firstName );
		System.out.println( "\tGPA:   " + gPA);
		System.out.println( "\tGrade: " + grade);	
				
	}
}