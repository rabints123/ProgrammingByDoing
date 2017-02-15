public class VariablesAndNames
{
    public static void main( String[] args )
    {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        cars = 100;
        space_in_a_car = 4;
        drivers = 30;
        passengers = 90;
        cars_not_driven = cars - drivers;
        cars_driven = drivers;

	//Pool capacity of a car
        carpool_capacity = cars_driven * space_in_a_car;

	//Average number of passengers a can can accomodate
        average_passengers_per_car = passengers / cars_driven;


        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
    }
}

/*
Q 1. I used 4.0 for space_in_a_car, but is that necessary? What happens if it's just 4?
Ans: It is not necessary to write 4.0. If it's just 4 then also same output can be expected.

Q 2. Remember that 4.0 is a "floating point" number. Find out what that means.
Ans: Floating point is nothing but real numbers.
*/