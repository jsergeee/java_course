package OOP.Home_Work.Task_5.Servise;

import OOP.Home_Work.Task_5.Model.Student;

import java.util.ArrayList;
import java.util.List;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students = new ArrayList<>();
    private long studentIdCounter = 1;

    public void create(String firstName, String lastName, String patronymic, LocalDate dateOfBirth) {
        Student student = new Student(studentIdCounter++, firstName, lastName, patronymic, dateOfBirth);
        students.add(student);
    }

    public List<Student> getAll() {
        return students;
    }

    public void createStudent(Student student) {
    }

    public Student getStudentById(Long id) {
        return null;
    }
}