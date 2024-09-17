//Данный код соответствует принципу единственной ответственности (SRP), так как класс `StudentService` отвечает только за сервисную логику работы со списком студентов.
//Код также соответствует принципу открытости/закрытости (OCP), так как класс открыт для расширения, и его можно использовать для добавления новых методов работы со списком студентов.
//Код также соответствует принципу подстановки Барбары Лисков (LSP), так как класс `StudentService` реализует интерфейс `UserService<Student>`, который используется для работы со списком студентов.
//Принцип разделения интерфейса (ISP) применен, так как класс реализует только необходимые методы интерфейса `UserService<Student>`.
//Принцип инверсии зависимостей (DIP) также применен, так как класс зависит только от абстрактного типа данных (`UserService<Student>`) в своих полях и методах, а не от конкретных реализаций. Это позволяет легко заменять реализацию интерфейса `UserService<Student>` на другую, не меняя код класса `StudentService`.


package OOP.Home_Work.Task_6.Servise;

import OOP.Home_Work.Task_6.Model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student> {

    private final List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (Student student: students){
            if (student.getStudentId() > countMaxId){
                countMaxId = student.getStudentId();
            }
        }
        countMaxId++;
        Student student = new Student(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        students.add(student);
    }
}
