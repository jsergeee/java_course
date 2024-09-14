package OOP.Home_Work.Task_4;

public class Main {
    public static void main(String[] args) {

        TeacherControl teacherControl = new TeacherControl();
        teacherControl.createTeacher();
        teacherControl.displayTeachers();
//        teacherControl.updateTeacher();
        TeacherService teacherService = new TeacherService();
        teacherService.getTeachers();

    }
}

