package basicsofjava;
//Using final with variables, methods, and classes
public class FinalKeywordExample {

 // Final variable (constant)
 public static final int MAX_VALUE = 100;

 // Final method
 public final void displayMessage() {
     System.out.println("This is a final method.");
 }

 // Final class (cannot be extended)
 final class FinalClass {
     // Class implementation
 }

 public static void main(String[] args) {
     // Using final variable
     System.out.println("Max value: " + MAX_VALUE);

     // Creating an instance of FinalKeywordExample
     FinalKeywordExample example = new FinalKeywordExample();

     // Calling final method
     example.displayMessage();

     // Creating an instance of FinalClass (final class)
     FinalClass finalInstance = example.new FinalClass();
 }
}


