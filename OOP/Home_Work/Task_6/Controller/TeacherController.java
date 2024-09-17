package OOP.Home_Work.Task_6.Controller;



import OOP.Home_Work.Task_6.Model.Teacher;
import OOP.Home_Work.Task_6.Servise.TeacherService;
import OOP.Home_Work.Task_6.View.TeacherView;

import java.time.LocalDate;
import java.util.List;

public class TeacherController {

    private final TeacherService teacherService;
    private final TeacherView teacherView;

    public TeacherController(TeacherService teacherService, TeacherView teacherView) {
        this.teacherService = teacherService;
        this.teacherView = teacherView;
    }

    public TeacherController(TeacherService teacherService, TeacherService teacherService1, TeacherView teacherView) {
        this.teacherService = teacherService1;
        this.teacherView = teacherView;
    }

    public void createTeacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        teacherService.create(firstName, secondName, patronymic, dateOfBirth);
    }

    public void updateTeacher(Teacher teacherToUpdate, String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        teacherService.update(teacherToUpdate, firstName, secondName, patronymic, dateOfBirth);
    }

    public void showAllTeachers() {
        List<Teacher> teachers = teacherService.getAll();
        teacherView.sendOnConsole(teachers);
    }

    public List<Teacher> getAllTeachers() {
        return List.of();
    }
}
