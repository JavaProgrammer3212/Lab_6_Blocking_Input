import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double gallonAmount = 0;

        double fuelEfficiency = 0;

        double gasPrice = 0;

        double costToDrive;

        double fullDistance;

        boolean loop = true;

        do {

            System.out.println("Please input the number of gallons of gas that the tank holds:");

            if (in.hasNextDouble()) {

                gallonAmount = in.nextDouble();

                in.nextLine();

                loop = false;

            }
            else {

                System.out.println("Error: Input type is invalid. Try again...");

                in.nextLine(); //code looped infinitely without this line

            }

        } while (loop == true);

        loop = true;

        do {

            System.out.println("Please input the fuel efficiency in miles per gallon:");

            if (in.hasNextDouble()) {

                fuelEfficiency = in.nextDouble();

                in.nextLine();

                loop = false;

            }
            else {

                System.out.println("Error: Input type is invalid. Try again...");

                in.nextLine(); //code looped infinitely without this line

            }

        } while (loop == true);

        loop = true;

        do {

            System.out.println("Please input the price of gas per gallon:");

            if (in.hasNextDouble()) {

                gasPrice = in.nextDouble();

                in.nextLine();

                loop = false;

            }
            else {

                System.out.println("Error: Input type is invalid. Try again...");

                in.nextLine(); //code looped infinitely without this line

            }

        } while (loop == true);

        costToDrive = (100 / fuelEfficiency) * gasPrice;

        System.out.println("The cost to drive 100 miles is $" + costToDrive);

        fullDistance = gallonAmount * fuelEfficiency;

        System.out.println("On a full tank of gas the car can drive " + fullDistance + " miles");

    }
}
