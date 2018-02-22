
import java.util.Scanner;

public class Hw1 {

    public static void main(String[] args) {

        // TODO ask for the number of miles and the number of seconds

        double miles = 0;
        int seconds = 0;

        // Creates new Scanner object, passing in keyboard input
        Scanner scanHelper = new Scanner(System.in);


        System.out.println("Please enter the number of miles:");

        // Gets input in double format, stores in miles
        miles = scanHelper.nextDouble();



        System.out.println("Please enter the number of seconds:");

        // Gets input in int format, stores in seconds
        seconds = scanHelper.nextInt();



        // TODO print the average speed in miles per hour and kilometers per hour

        // Output the average speed in mph and kph
        double mph = miles / ((seconds / 3600.0));

        System.out.println("MPH is " + mph);


    }

}
