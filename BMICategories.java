
import java.util.Scanner;

public class BMICategories {

	public static void main(String[] args) 
	{
	
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("Your height in m: "); 
		double height = keyboard.nextDouble();
		System.out.println("Your weight in kg:  "); 
		double weight = keyboard.nextDouble(),

		BMI = weight / (height * height);

		if ( BMI < 18.5 ) {
			System.out.println("under weight");
		}
		else if ( BMI < 25 ) {
			System.out.println("normal weight");
		}
		else if ( BMI < 30 ) {
			System.out.println("over weight");
		}
		else {
			System.out.println("obese");
		}

	}

}
