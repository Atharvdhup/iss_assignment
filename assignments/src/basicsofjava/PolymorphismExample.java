package basicsofjava;
class Parent {
    void display() {
        System.out.println("This is the display method in the Parent class.");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("This is the display method in the Child class.");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Creating polymorphic objects
        Parent polymorphicObject = new Child();

        // Calling the display method using polymorphic object
        polymorphicObject.display();
    }
}
