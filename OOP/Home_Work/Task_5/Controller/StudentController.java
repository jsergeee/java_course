package OOP.Home_Work.Task_5.Controller;

import OOP.Home_Work.Task_5.Model.Student;
import OOP.Home_Work.Task_5.Servise.StudentService;

public class StudentController implements UserController<Student> {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void create(Student student) {
        studentService.createStudent(student);
    }

    public Student getStudentById(Long id) {
        return studentService.getStudentById(id);
    }
}