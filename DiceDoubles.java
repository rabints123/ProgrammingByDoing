import java.util.Random;

public class DiceDoubles 
{
	public static void main(String[] args) 
	{
	
		System.out.println("HERE COMES THE DICE!");
		int random1, random2;
		
		do {
			random1 = 1 + new Random().nextInt(6);
			random2 = 1 + new Random().nextInt(6);

			System.out.println("Roll #1:" + random1);
			System.out.println("Roll #2:" + random2);
			System.out.println("The total is "+ (random1 + random2) );
		} while (random1 != random2);
	}
}
