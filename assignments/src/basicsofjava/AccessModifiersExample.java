package basicsofjava;

//A class with different access modifiers
public class AccessModifiersExample {

 // Public variable
 public int publicVariable = 10;

 // Protected variable
 protected int protectedVariable = 20;

 // Default (package-private) variable
 int defaultVariable = 30;

 // Private variable
 private int privateVariable = 40;

 // Public constructor
 public AccessModifiersExample() {
     System.out.println("Public constructor");
 }

 // Protected method
 protected void protectedMethod() {
     System.out.println("Protected method");
 }

 // Default (package-private) method
 void defaultMethod() {
     System.out.println("Default method");
 }

 // Private method
 private void privateMethod() {
     System.out.println("Private method");
 }

 // Main method to demonstrate access modifiers
 public static void main(String[] args) {
     AccessModifiersExample example = new AccessModifiersExample();

     // Accessing variables
     System.out.println("Public variable: " + example.publicVariable);
     System.out.println("Protected variable: " + example.protectedVariable);
     System.out.println("Default variable: " + example.defaultVariable);
     System.out.println("Private variable: " + example.privateVariable);

     // Accessing methods
     example.protectedMethod();
     example.defaultMethod();
     example.privateMethod();
 }
}
