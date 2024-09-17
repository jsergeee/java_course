//Данный код не соответствует принципу единственной ответственности (SRP), так как класс Main выполняет сразу несколько задач:
//создание объектов сервисов и контроллеров,
//ввод данных с клавиатуры,
//вывод информации на консоль.
//Кроме того, данный код не соответствует принципу инверсии зависимостей (DIP),
//так как класс Main жестко зависит от конкретных реализаций сервисов и View,
//что делает его изменение и расширение затруднительным.
//Для улучшения кода можно вынести логику создания объектов сервисов и контроллеров
//в отдельный класс-фабрику, а логику ввода данных и вывода информации на консоль
//вынести в отдельные классы-контроллеры. Также можно использовать зависимость от абстрактных типов данных,
//чтобы класс Main зависел только от интерфейсов сервисов и View, а не от их конкретных реализаций.
// Однако я прошу прощения, но я не

package OOP.Home_Work.Task_6.View;

import OOP.Home_Work.Task_4.Controller.TeacherController;
import OOP.Home_Work.Task_4.Servise.StudentGroupService;
import OOP.Home_Work.Task_4.Servise.StudentService;
import OOP.Home_Work.Task_4.Servise.TeacherService;
import OOP.Home_Work.Task_4.View.StudentView;
import OOP.Home_Work.Task_4.View.TeacherView;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TeacherService teacherService = new TeacherService();
        OOP.Home_Work.Task_4.View.TeacherView teacherView = new TeacherView();
        TeacherController teacherController = new TeacherController(teacherService, teacherView);

        StudentService studentService = new StudentService();
        OOP.Home_Work.Task_4.View.StudentView studentView = new StudentView();
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
