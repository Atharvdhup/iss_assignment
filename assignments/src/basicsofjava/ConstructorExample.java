package basicsofjava;
public class ConstructorExample {

    // Instance variables
    private String name;
    private int age;

    // Default constructor (no-argument constructor)
    public ConstructorExample() {
        System.out.println("Default Constructor called");
        name = "Shri Patil";
        age = 30;
    }

    // Parameterized constructor
    public ConstructorExample(String name, int age) {
        System.out.println("Parameterized Constructor called");
        this.name = name;
        this.age = age;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object using the default constructor
        ConstructorExample defaultConstructorObj = new ConstructorExample();
        System.out.println("Information using default constructor:");
        defaultConstructorObj.displayInfo();
        System.out.println();

        // Creating an object using the parameterized constructor
        ConstructorExample parameterizedConstructorObj = new ConstructorExample("Alok", 25);
        System.out.println("Information using parameterized constructor:");
        parameterizedConstructorObj.displayInfo();
    }
}
