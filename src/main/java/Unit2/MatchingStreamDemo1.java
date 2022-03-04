package Unit2;

import Unit1.Student;
import Unit1.StudentResultImpl;

import java.util.List;
import java.util.stream.Stream;

public class MatchingStreamDemo1 {
    public static void main(String[] args) {
        List<Student> studentList = Student.getListOfStudents();
        StudentResultImpl studentResult =  new StudentResultImpl();
        studentList.forEach(student ->studentResult.createResult(student));


        // Matching helper
        System.out.println("All the students are passed = "+helper1(studentList.stream()));
        System.out.println("All the students are greater than 18 = "+helper2(studentList.stream()));
    }

    private static boolean helper2(Stream<Student> studentList) {
        return studentList.allMatch(student -> student.getAge()>40);
    }

    private static boolean helper1(Stream<Student> studentList) {
        return studentList.allMatch(student -> student.getPercentage()>40);
    }
}
