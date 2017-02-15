import java.util.Scanner;



public class ChooseYourOwnAdventure
{

	
 	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner(System.in);


               	System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE! You are in a creepy house!  Would you like to go \"upstairs\" or into the\"kitchen\" ?");
               	String option1=keyboard.next();
               
                if(option1.equals("kitchen"))
		{
		   System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"or look in a \"cabinet\".");
                   String option2=keyboard.next();

                   if(option2.equals("refrigerator"))
		   {
                       System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty.Would you like to eat some of the food?(\"yes\" or \"no\")");
		 	String option3=keyboard.next();
  			 if(option3.equals("no"))
		   	 {
				System.out.println("You die of starvation... eventually.");
			 }

		   }	
		}

 		if(option1.equals("upstairs"))
		{
		   System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master\"bedroom\".There is also a\"bathroom\" off the hallway.  Where would you like to go?");
                   String option2=keyboard.next();

                   if(option2.equals("bedroom"))
		   {
                       System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture. The bed is unmade. In the back of the room, the closet door is ajar. Would you like to open the door?(\"yes\" or \"no\")");
		 	String option3=keyboard.next();
  			 if(option3.equals("no"))
		   	 {
				System.out.println("Well, then I guess you'll never know what was in there. Thanks for playing,I'm tired of making nested if statements.");
			 }

		   }	
		}
      

	}


}
