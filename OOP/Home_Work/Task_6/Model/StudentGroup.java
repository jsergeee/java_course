//Данный код соответствует принципу единственной ответственности (SRP), так как класс StudentGroup отвечает только за хранение списка студентов и преподавателя, а также реализует интерфейс Iterable<Student> для итерации по списку студентов.
//Также код соответствует принципу открытости/закрытости (OCP), так как класс StudentGroup закрыт для изменения (нет никаких методов, которые бы изменяли его поля), но открыт для расширения (можно создавать подклассы, которые будут расширять его функциональность).
//Код также соответствует принципу подстановки Барбары Лисков (LSP), так как класс StudentGroup не является базовым классом для других классов.
//Принцип разделения интерфейса (ISP) также применен, так как класс StudentGroup реализует только один интерфейс Iterable<Student>, который содержит только один метод iterator().
//Принцип инверсии зависимостей (DIP) также применен, так как класс StudentGroup зависит только от абстракции Iterable<Student>, а не от конкретной реализации.
//

package OOP.Home_Work.Task_6.Model;

import java.util.List;

public class StudentGroup implements Iterable<Student>{
    private List<Student> students;
    private Teacher teacher;

    public StudentGroup(Teacher teacher, List<Student> students) {
        this.students = students;
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                ", teacher=" + teacher +
                '}';
    }

    @Override
    public StudentGroupIterator iterator() {
        return new StudentGroupIterator(this);
    }
}
