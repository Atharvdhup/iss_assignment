package basicsofjava;
class A {
    // Private method that cannot be overridden
    private void privateMethod() {
        System.out.println("This is a private method in class A.");
    }

    // Public method that calls the private method
    public void publicMethod() {
        privateMethod();
    }
}

// Example usage of class A
class ExampleUsage {
    public static void main(String[] args) {
        A objectA = new A();
        objectA.publicMethod(); // Calls the public method in class A
    }
}
