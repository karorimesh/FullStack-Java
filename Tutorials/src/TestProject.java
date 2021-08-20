// Import te java class
import java.util.Scanner;

public class TestProject {
    public static void main(String[] args) {
        String textvar = "";
        Scanner in = new Scanner(System.in);
        double gravity = 9.81;
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;

        // do while to iterate until the user quits
        do {
            System.out.println("Earth's gravity = 9.81");
            System.out.println("Initial position of the object "
                    + initialPosition +
                    " Input \"pos\" to change the position");
            System.out.println("Initial velocity of the object "
                    + initialVelocity +
                    " Input \"vel\" to change the velocity");
            System.out.println("Falling time of the object "
                    + fallingTime +
                    " Input \"time\" to change the falling time");

            //Calculation for final position
            finalPosition = 0.5 * gravity * fallingTime +
                    initialVelocity * fallingTime + initialPosition;

            System.out.println("The object's final position"
                    + fallingTime + " seconds is "
                    + finalPosition + "m.");
            System.out.println("Input \"quit\" to exit the application");
            textvar = in.nextLine();

            //Control flow statements

            if ("pos".equals(textvar)){
                System.out.println("Enter initial position of object: ");
                while (!in.hasNextDouble()) in.next();
                initialPosition = in.nextDouble();
            } else if ("vel".equals(textvar)){
                System.out.println(" Enter the initial velocity: ");
                while (!in.hasNextDouble()) in.next();
                initialVelocity = in.nextDouble();
            } else if ("time".equals(textvar)){
                System.out.println("Enter the falling time: ");
                while (!in.hasNextDouble()) in.next();
                fallingTime = in.nextDouble();
            } else if (!"quit".equals(textvar)){
                System.out.println("\b");
            }
        }while (!"quit".equals(textvar));
    }
}
