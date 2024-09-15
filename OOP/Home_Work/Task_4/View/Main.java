package OOP.Home_Work.Task_4.View;

import OOP.Home_Work.Task_4.Controller.TeacherController;
import OOP.Home_Work.Task_4.Servise.StudentGroupService;
import OOP.Home_Work.Task_4.Servise.StudentService;
import OOP.Home_Work.Task_4.Servise.TeacherService;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TeacherService teacherService = new TeacherService();
        TeacherView teacherView = new TeacherView();
        TeacherController teacherController = new TeacherController(teacherService, teacherView);

        StudentService studentService = new StudentService();
        StudentView studentView = new StudentView();
        StudentGroupService studentGroupService = new StudentGroupService();

        Scanner scanner = new Scanner(System.in);

        // Добавление учителей
        System.out.println("Добавление учителей. Введите 'exit' для завершения.");
        while (true) {
            System.out.print("Введите имя учителя: ");
            String firstName = scanner.nextLine();
            if (firstName.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Введите фамилию учителя: ");
            String secondName = scanner.nextLine();
            System.out.print("Введите отчество учителя: ");
            String patronymic = scanner.nextLine();
            System.out.print("Введите дату рождения учителя в формате гггг-мм-дд: ");
            LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());
            teacherController.createTeacher(firstName, secondName, patronymic, dateOfBirth);
        }

        // Вывод списка учителей
        System.out.println("Список учителей:");
        teacherController.showAllTeachers();

        // Добавление студентов
        System.out.println("Добавление студентов. Введите 'exit' для завершения.");
        while (true) {
            System.out.print("Введите имя студента: ");
            String firstName = scanner.nextLine();
            if (firstName.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Введите фамилию студента: ");
            String secondName = scanner.nextLine();
            System.out.print("Введите отчество студента: ");
            String patronymic = scanner.nextLine();
            System.out.print("Введите дату рождения студента в формате гггг-мм-дд: ");
            LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());
            studentService.create(firstName, secondName, patronymic, dateOfBirth);
        }

        // Вывод списка студентов
        System.out.println("Список студентов:");
        studentView.sendOnConsole(studentService.getAll());
    }
}
