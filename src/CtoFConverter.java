import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double celsiusTemp;

        double fahrenheitTemp;

        boolean loop = true; //used this style of var rather than while(!done) as it makes more sense when I am writing the code

        do {

            System.out.println("Please input the temperature in Celsius:");

            if (in.hasNextDouble()) {

                celsiusTemp = in.nextDouble();

                in.nextLine();

                fahrenheitTemp = (celsiusTemp * 1.8) + 32;

                System.out.println("The temperature " + celsiusTemp + " degrees Celsius is equal to " + fahrenheitTemp + " degrees Fahrenheit");

                loop = false;

            }
            else {

                System.out.println("Error: Input type is invalid. Try again...");

                in.nextLine(); //code looped infinitely without this line

            }

        } while (loop == true);
    }
}
