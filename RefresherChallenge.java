import java.util.Scanner;

public class RefresherChallenge 
{
	public static void main(String[] args) 
	{
	

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter name ");
		String name = keyboard.nextLine();

		int n = 10;
		if( name.equals("Mitchell") ) 
		{ 
			n = 5;
			name="Mitchell";
		}
	
		for(int i=1;i<=n;++i)
			System.out.println(name);
	}

}
