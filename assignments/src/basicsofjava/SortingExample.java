package basicsofjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1 implements Comparable<Student1> {
    private int id;
    private String name;

    public Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    // Comparable implementation
    @Override
    public int compareTo(Student1 other) {
        // Compare students based on their IDs
        return Integer.compare(this.id, other.id);
    }
}

public class SortingExample {

    public static void main(String[] args) {
        // List of Students
        List<Student1> studentList = new ArrayList<>();
        studentList.add(new Student1(3, "Rohan"));
        studentList.add(new Student1(1, "Aarav"));
        studentList.add(new Student1(2, "Diya"));

        // Sorting using Comparable (natural order)
        Collections.sort(studentList);

        System.out.println("Sorted List of Students (by ID):");
        for (Student1 student : studentList) {
            System.out.println(student);
        }

        // List of Integers
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(2);
        integerList.add(8);

        // Sorting using Comparator (reverse order)
        Collections.sort(integerList, Comparator.reverseOrder());

        System.out.println("\nSorted List of Integers (reverse order):");
        for (Integer number : integerList) {
            System.out.println(number);
        }
    }
}
