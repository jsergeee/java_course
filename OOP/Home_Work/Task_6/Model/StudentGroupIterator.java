//Данный код соответствует принципу единственной ответственности (SRP), так как класс `StudentGroupIterator` отвечает только за итерацию по списку студентов.
//Также код соответствует принципу открытости/закрытости (OCP), так как класс `StudentGroupIterator` закрыт для изменения (нет никаких методов, которые бы изменяли его поля), но открыт для расширения (можно создавать подклассы, которые будут расширять его функциональность).
//Код также соответствует принципу подстановки Барбары Лисков (LSP), так как класс `StudentGroupIterator` не является базовым классом для других классов.
//Принцип разделения интерфейса (ISP) также применен, так как класс `StudentGroupIterator` реализует только один интерфейс `Iterator<Student>`, который содержит только два метода `hasNext()` и `next()`.
//Принцип инверсии зависимостей (DIP) также применен, так как класс `StudentGroupIterator` зависит только от абстракции `Iterator<Student>`, а не от конкретной реализации.



package OOP.Home_Work.Task_6.Model;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {

    private int counter;
    private final List<Student> students;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.students = studentGroup.getStudents();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size() - 1;
    }

    @Override
    public Student next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return students.get(counter);
    }
}
