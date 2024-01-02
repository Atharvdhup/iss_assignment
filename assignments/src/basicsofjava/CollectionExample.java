package basicsofjava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
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
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class CollectionExample {

    public static void main(String[] args) {
        // List of Students
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Aarav"));
        studentList.add(new Student(2, "Diya"));
        studentList.add(new Student(3, "Rohan"));

        System.out.println("List of Students:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        // Set of Students
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student(1, "Aarav"));
        studentSet.add(new Student(2, "Diya"));
        studentSet.add(new Student(3, "Rohan"));

        System.out.println("\nSet of Students:");
        for (Student student : studentSet) {
            System.out.println(student);
        }

        // Map of Students (ID as key, Student as value)
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, new Student(1, "Aarav"));
        studentMap.put(2, new Student(2, "Diya"));
        studentMap.put(3, new Student(3, "Rohan"));

        System.out.println("\nMap of Students (ID as key):");
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
