import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double width = 0;

        double height = 0;

        double area;

        double perimeter;

        double diagonal;

        boolean loop = true;

        do {

            System.out.println("Please input the width of the rectangle:");

            if (in.hasNextDouble()) {

                width = in.nextDouble();

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

            System.out.println("Please input the height of the rectangle:");

            if (in.hasNextDouble()) {

                height = in.nextDouble();

                in.nextLine();

                loop = false;

            }
            else {

                System.out.println("Error: Input type is invalid. Try again...");

                in.nextLine(); //code looped infinitely without this line

            }

        } while (loop == true);

        area = width * height;

        System.out.println("The area of the rectangle is " + area);

        perimeter = (2 * width) + (2 * height);

        System.out.println("The perimeter of the rectangle is " + perimeter);

        diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        System.out.println("The length of the the diagonal lines is " + diagonal);

    }
}
