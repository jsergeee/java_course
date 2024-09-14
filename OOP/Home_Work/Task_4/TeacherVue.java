package OOP.Home_Work.Task_4;

import java.util.List;

class TeacherView {
    private TeacherService teacherService;

    public TeacherView(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    public void displayTeachers() {
        List<Teacher> teachers = teacherService.getTeachers();
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

}
