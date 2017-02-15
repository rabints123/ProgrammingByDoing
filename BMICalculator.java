
import java.util.Scanner;



public class BMICalculator 
{


	public static void main(String[] args) 
	{
			
		Scanner keyboard = new Scanner(System.in);

	
		double height;
		double weight;

		System.out.print( "Your height in m: " );
		height = keyboard.nextDouble();
		

		System.out.print( "Your weight in kg: " );
		weight = keyboard.nextDouble();
		
		
		System.out.printf( "\nYour BMI is " + (weight / (height * height)) );
	
	}
	

}
