import Unit1.Student;
import Unit1.StudentFunctionalInterface;
import Unit1.StudentResultImpl;
import Unit1.StudentResultInterface;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Arjun", List.of(47, 50, 76, 89, 98));
        Student student2 = new Student(102, "Ramesh", "Shakuntala", 16);
        Student student3 = new Student(103, "Rakesh", List.of(45, 65, 70, 25, 98));
        Student student4 = new Student(104, "Jimmy", List.of(47, 56, 76, 89, 98));

        StudentResultImpl s = new StudentResultImpl();
        s.createResult(student1);
        s.createResult(student3);
        s.createResult(student4);

        // abstract methods
        System.out.println("Total Marks = " + s.totalMarks(student1));
        System.out.println("Tota Percentage = " + s.totalPercentage(student1));

        // default methods
        s.studentResult(student1);
        // direct calling of static methods
        StudentResultInterface.printDetailsOfStudent(student1);

        // lambda expression to define personalDetailsOfStudent method
        StudentFunctionalInterface studentFunctionalInterface = (student -> System.out.println("Age = " + student.getAge()));

        // calling personalDetailsOfStudent
        studentFunctionalInterface.personalDetailsOfStudent(student2);


        // Comparator Interface
        ArrayList<Student> studentArrayList = new ArrayList<>(List.of(student1, student3, student4));

        // sorting student list based on the total marks obtained by the students
        Comparator<Student> comparator = (Student o1, Student o2) -> {
            if (o1.getTotalMarks() > o2.getTotalMarks()) {
                return 1;
            }
            return -1;
        };
        Collections.sort(studentArrayList, comparator);
        for (var it : studentArrayList) {
            System.out.println("Name = " + it.getName());
            System.out.println("Name = " + it.getTotalMarks());
        }

    }
}
