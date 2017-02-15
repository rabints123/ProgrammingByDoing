public class AddingValuesInALoop 
{
	public static void main(String[] args) 
	{
		System.out.println( "I will add up the numbers you give" );
		int num, sum = 0;
		
		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		System.out.print( "Number: " );
		num = keyboard.nextInt();
		
		while (num != 0)
		{
			sum = sum + num;
			System.out.println( "The total so far is " + sum);
			System.out.print( "Number: " );
			num = keyboard.nextInt();
		}
		
		System.out.println( "The total is " + sum);
	}
}
