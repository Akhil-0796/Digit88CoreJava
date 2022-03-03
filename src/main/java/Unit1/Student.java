package Unit1;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private float percentage;
    private int totalMarks;
    private List<Integer> subjectMarks= new ArrayList<>();
    private String fatherName;
    private String MotherName;
    private int age;

    public Student(int id, String name, List<Integer> subjectMarks, String fatherName, String motherName, int age) {
        this.id = id;
        this.name = name;
        this.subjectMarks = subjectMarks;
        this.fatherName = fatherName;
        MotherName = motherName;
        this.age = age;
    }

    public Student(int id, String fatherName, String motherName, int age) {
        this.id = id;
        this.fatherName = fatherName;
        MotherName = motherName;
        this.age = age;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return MotherName;
    }

    public int getAge() {
        return age;
    }

    public List<Integer> getSubjectMarks() {
        return subjectMarks;
    }

    public Student(int id, String name, List<Integer> subjectMarks) {
        this.id = id;
        this.name = name;
        this.subjectMarks = subjectMarks;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }
}
