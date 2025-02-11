package exp5;
import java.util.ArrayList;
import java.util.List;

// Superclass
abstract class Person {
    abstract void performDuty();
}

// Subclass Student
class Student extends Person {
    @Override
    void performDuty() {
        System.out.println("Student is studying.");
    }
}

// Subclass Teacher
class Teacher extends Person {
    @Override
    void performDuty() {
        System.out.println("Teacher is teaching.");
    }
}

public class SchoolManagementSystem {
    public static void main(String[] args) {
        // Create a list of Person references
        List<Person> people = new ArrayList<>();

        // Add instances of Student and Teacher
        people.add(new Student());
        people.add(new Teacher());
        people.add(new Student());
        people.add(new Teacher());
        people.add(new Student());

        // Iterate through the list and call performDuty()
        for (Person person : people) {
            person.performDuty();
        }

        Person[] peopleArray = new Person[5];
        peopleArray[0] = new Student();
        peopleArray[1] = new Teacher();
        peopleArray[2] = new Student();
        peopleArray[3] = new Teacher();
        peopleArray[4] = new Student();

        System.out.println("\nDemonstrating with an array:");
        for(Person person : peopleArray){
            person.performDuty();
        }
    }
}
