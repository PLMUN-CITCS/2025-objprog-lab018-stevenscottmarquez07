import java.util.Scanner;

public class EvenOddChecker {

    // Method to get an integer input from the user
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Enter an integer: ");
        
        // Validate input to ensure it's an integer
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer.");
            scanner.next(); // consume the invalid input
        }
        
        number = scanner.nextInt();
        return number;
    }

    // Method to check if a number is even or odd
    public static String checkEvenOrOdd(int number) {
        // Use modulo operator to check if number is even or odd
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }

    // Main method to drive the program
    public static void main(String[] args) {
        // Get the integer input from user
        int number = getIntegerInput();

        // Check if the number is even or odd and store the result
        String result = checkEvenOrOdd(number);

        // Display the result to the user
        System.out.println(result);
    }
}
