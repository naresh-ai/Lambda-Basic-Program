package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class Array9 implements Comparable<Array9> {

    String name;
    int age;

    // Constructor
    public Array9(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Array9 other) {
        return this.age - other.age;  // Sort by age
    }


    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

class Main {
    public static void main(String[] args) {


        ArrayList<Array9> students = new ArrayList<>();

        // Adding students to the list
        students.add(new Array9("Alice", 22));
        students.add(new Array9("Bob", 25));
        students.add(new Array9("Charlie", 20));


        System.out.println("Before sorting: " + students);

        Collections.sort(students);

        System.out.println("After sorting: " + students);
    }
}


