package basicsofjava;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        // Exception handling using try-catch block
        try {
            int result = divideNumbers(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }

        // Handling multiple exceptions using multi-catch block
        try {
            String input = getUserInput();
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException | NullPointerException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }

        // Hierarchy of exceptions
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Accessing an out-of-bounds index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array Index Out of Bounds Exception: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Generic Exception: " + e.getMessage());
        }

        // Using throw to explicitly throw an exception
        try {
            validateAge(15);
        } catch (IllegalArgumentException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }

        // Using throws in method declaration
        try {
            processFile("example.txt");
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }

    // Method to demonstrate throw
    private static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        }
        System.out.println("Valid age: " + age);
    }

    // Method to demonstrate throws in method declaration
    private static void processFile(String fileName) throws FileNotFoundException {
        // Simulating file processing (assuming FileNotFoundException may occur)
        throw new FileNotFoundException("File not found: " + fileName);
    }

    // Method to demonstrate handling ArithmeticException
    private static int divideNumbers(int dividend, int divisor) {
        return dividend / divisor;
    }

    // Method to demonstrate handling NumberFormatException and NullPointerException
    private static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scanner.nextLine();
    }
}
