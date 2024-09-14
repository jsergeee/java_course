package OOP.Home_Work.Task_4;

import java.util.Scanner;

public class TeacherControl {

    private TeacherService teacherService;
    private TeacherView teacherView;

    public TeacherControl() {
        teacherService = new TeacherService();
        teacherView = new TeacherView(teacherService);
    }

    public void createTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter teacher name: ");
        String name = scanner.nextLine();
        System.out.print("Enter teacher subject: ");
        String subject = scanner.nextLine();
        System.out.print("Enter teacher experience: ");
        int experience = scanner.nextInt();
        teacherService.createTeacher(name, subject, experience);
    }

    public void updateTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter teacher index to update: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Создаем новую строку

        // Проверка, не пуст ли список преподавателей
        if (teacherService.getTeachers().size() >= index) {
            System.out.print("Enter new teacher name: ");
            String name = scanner.nextLine();
            System.out.print("Enter new teacher subject: ");
            String subject = scanner.nextLine();
            System.out.print("Enter new teacher experience: ");
            int experience = scanner.nextInt();
            teacherService.updateTeacher(index, name, subject, experience);
        } else {
            System.out.println("Invalid index. The list of teachers is empty or the index is out of bounds.");
        }
    }


    public void displayTeachers() {
        teacherView.displayTeachers();
    }

}
