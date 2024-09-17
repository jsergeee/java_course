//Данный код соответствует принципу единственной ответственности (SRP), так как класс `TeacherService` отвечает только за сервисную логику работы со списком учителей.
//Код также соответствует принципу открытости/закрытости (OCP), так как класс открыт для расширения, и его можно использовать для добавления новых методов работы со списком учителей.
//Код также соответствует принципу подстановки Барбары Лисков (LSP), так как класс `TeacherService` реализует интерфейс `UserService<Teacher>`, который используется для работы со списком учителей.
//Принцип разделения интерфейса (ISP) применен, так как класс реализует только необходимые методы интерфейса `UserService<Teacher>`.
//Принцип инверсии зависимостей (DIP) также применен, так как класс зависит только от абстрактного типа данных (`UserService<Teacher>`) в своих полях и методах, а не от конкретных реализаций. Это позволяет легко заменять реализацию интерфейса `UserService<Teacher>` на другую, не меняя код класса `TeacherService`.


package OOP.Home_Work.Task_6.Servise;

import OOP.Home_Work.Task_6.Model.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {

    private final List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (Teacher teacher: teachers){
            if (teacher.getTeacherId() > countMaxId){
                countMaxId = teacher.getTeacherId();
            }
        }
        countMaxId++;
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        teachers.add(teacher);
    }

    public void update(Teacher teacherToUpdate, String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        teacherToUpdate.setFirstName(firstName);
        teacherToUpdate.setSecondName(secondName);
        teacherToUpdate.setPatronymic(patronymic);
        teacherToUpdate.setDateOfBirth(dateOfBirth);
    }
}
