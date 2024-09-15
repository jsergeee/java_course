package OOP.Home_Work.Task_5.Controller;

import OOP.Home_Work.Task_5.Model.Teacher;
import OOP.Home_Work.Task_5.Servise.TeacherService;
import OOP.Home_Work.Task_5.View.TeacherView;

import java.time.LocalDate;

public class TeacherController {
    private TeacherService teacherService;
    private TeacherView teacherView;

    public TeacherController(TeacherService teacherService, TeacherView teacherView) {
        this.teacherService = teacherService;
        this.teacherView = teacherView;
    }

    public void createTeacher(String firstName, String lastName, String patronymic, LocalDate dateOfBirth) {
        teacherService.create(firstName, lastName, patronymic, dateOfBirth);
    }

    public void showAllTeachers() {
        teacherView.displayTeachers(teacherService.getAll());
    }

    public Teacher getTeacherById(Long id) {
        return teacherService.getById(id);
    }
}