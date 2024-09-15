package OOP.Home_Work.Task_5.View;

import OOP.Home_Work.Task_5.Model.Teacher;

import java.util.List;

public class TeacherView {

    public void displayTeachers(List<Teacher> teachers) {
        teachers.forEach(System.out::println);
    }

    public void displayTeacher(Teacher teacher) {
        if (teacher != null) {
            System.out.println(teacher);
        } else {
            System.out.println("Teacher not found.");
        }
    }
}