
import java.util.Scanner;

public class SpaceBoxing 
{
	public static void main(String[] args) 
	{

		Scanner keyboard = new Scanner(System.in);
		System.out.println( "Please enter your current earth weight: " );
		int weight = keyboard.nextInt();
		
		System.out.println("I have information for the following planets:\n"
		   +"\t1. Venus   2. Mars    3. Jupiter\n"
		   +"\t4. Saturn  5. Uranus  6. Neptune");
		
		System.out.println("Which planet are you visiting? "); 
		int planet = keyboard.nextInt();
		
		double[] arr = {.78,.39,2.65,1.17,1.05,1.23};
		
		System.out.println( "Your weight would be "+ (weight*arr[planet-1])+" pounds on that planet.");
		
	}

}
