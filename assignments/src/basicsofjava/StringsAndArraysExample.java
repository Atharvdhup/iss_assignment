package basicsofjava;

public class StringsAndArraysExample {

    public static void main(String[] args) {
        // Strings
        String greeting = "Hello, World!";
        System.out.println("String: " + greeting);

        // String length
        int length = greeting.length();
        System.out.println("String length: " + length);

        // String concatenation
        String name = "Alice";
        String welcomeMessage = greeting + " My name is " + name + ".";
        System.out.println("Concatenated String: " + welcomeMessage);

        // String methods
        System.out.println("Uppercase: " + greeting.toUpperCase());
        System.out.println("Lowercase: " + greeting.toLowerCase());
        System.out.println("Substring: " + greeting.substring(7, 12));

        // Arrays
        int[] numbers = {1, 2, 3, 4, 5};

        // Accessing array elements
        System.out.println("\nArray elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Array length
        System.out.println("Array length: " + numbers.length);

        // Sum of array elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of array elements: " + sum);

        // String array
        String[] fruits = {"Apple", "Banana", "Orange"};

        // Accessing string array elements
        System.out.println("\nString array elements:");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
