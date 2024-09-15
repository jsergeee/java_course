package OOP.Home_Work.Task_4.Controller;



import OOP.Home_Work.Task_4.Data.Teacher;
import OOP.Home_Work.Task_4.Servise.TeacherService;
import OOP.Home_Work.Task_4.View.TeacherView;

import java.time.LocalDate;
import java.util.List;

public class TeacherController {

    private final TeacherService teacherService;
    private final TeacherView teacherView;

    public TeacherController(TeacherService teacherService, TeacherView teacherView) {
        this.teacherService = teacherService;
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
}
