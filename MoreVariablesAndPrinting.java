public class MoreVariablesAndPrinting
{
    public static void main( String[] args )
    {
        String name, eyes, teeth, hair;
        int age, height, weight;
	double heightInCentimeters, weightInKilograms;


        name = "Zed A. Shaw";
        age = 35;     // not a lie
        height = 74;  // inches
        weight = 180; // lbs
        eyes = "Blue";
        teeth = "White";
        hair = "Brown";
	heightInCentimeters = height * 2.54;
	weightInKilograms = weight * 0.453592;

        System.out.println( "Let's talk about " + name + "." );
        System.out.println( "He's " + height + " inches (or " + heightInCentimeters  + " cm)  tall." );
        System.out.println( "He's " + weight + " pounds (or " + weightInKilograms + " kg) heavy." );
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "He's got " + eyes + " eyes and " + hair + " hair." );
        System.out.println( "His teeth are usually " + teeth + " depending on the coffee." );

        // This line is tricky; try to get it exactly right.
        System.out.println( "If I add " + age + ", " + height + ", and " + weight
            + " I get " + (age + height + weight) + "." );
    }
}