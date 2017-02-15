import java.util.Random;

public class Dice 
{
	public static void main(String[] args) 
	{
	
		System.out.println("HERE COMES THE DICE!");
		int roll1 = 1 + new Random().nextInt(6);
		int roll2 = 1 + new Random().nextInt(6);
	
		System.out.println("Roll #1:" + roll1);
		System.out.println("Roll #2:" + roll2);

		System.out.println("The total is "+ (roll1+roll2) );
	}

}