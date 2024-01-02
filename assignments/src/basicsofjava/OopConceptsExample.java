
//Package declaration
package basicsofjava;

//Abstract class with encapsulation
abstract class Animal {
 private String name;

 public Animal(String name) {
     this.name = name;
 }

 // Abstract method for overriding
 abstract void makeSound();

 // Encapsulated getter
 public String getName() {
     return name;
 }
}

//Inheritance and Polymorphism with subclasses
class Dog extends Animal {
 public Dog(String name) {
     super(name);
 }

 @Override
 void makeSound() {
     System.out.println(getName() + " says Woof!");
 }
}

class Cat extends Animal {
 public Cat(String name) {
     super(name);
 }

 @Override
 void makeSound() {
     System.out.println(getName() + " says Meow!");
 }
}

//Interface for additional behavior
interface Swimmable {
 void swim();
}

//Implementation of interface
class Fish extends Animal implements Swimmable {
 public Fish(String name) {
     super(name);
 }

 @Override
 void makeSound() {
     System.out.println(getName() + " makes bubbles...");
 }

 @Override
 public void swim() {
     System.out.println(getName() + " is swimming.");
 }
}

//Main class
public class OopConceptsExample {
 public static void main(String[] args) {
     // Polymorphism using abstract class and subclasses
     Animal dog = new Dog("Buddy");
     Animal cat = new Cat("Whiskers");
     Animal fish = new Fish("Nemo");

     // Using polymorphic array
     Animal[] animals = {dog, cat, fish};

     // Abstraction and Polymorphism in action
     for (Animal animal : animals) {
         animal.makeSound();

         // Checking for Swimmable interface
         if (animal instanceof Swimmable) {
             Swimmable swimmable = (Swimmable) animal;
             swimmable.swim();
         }
     }
 }
}
