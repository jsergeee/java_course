//Данный код соответствует принципу единственной ответственности (SRP), так как класс `StudentGroupService` отвечает только за сервисную логику работы со списком студентов.
//Код также соответствует принципу открытости/закрытости (OCP), так как класс открыт для расширения, и его можно использовать для добавления новых методов работы со списком студентов.
//Код также соответствует принципу подстановки Барбары Лисков (LSP), так как класс `StudentGroupService` использует классы `StudentGroup`, `Teacher` и `Student`, которые наследуются от класса `User`, и класс `UserComparator`, который наследуется от класса `Comparator`.
//Принцип разделения интерфейса (ISP) не применен, так как класс не реализует никаких интерфейсов.
//Принцип инверсии зависимостей (DIP) также не применен, так как класс зависит от конкретных типов данных (`StudentGroup`, `Teacher`, `Student`, `UserComparator`) в своих полях и методах. Однако, это не всегда является проблемой, особенно если класс используется только внутри одного модуля.

package OOP.Home_Work.Task_6.Servise;




import OOP.Home_Work.Task_6.Model.Student;
import OOP.Home_Work.Task_6.Model.StudentGroup;
import OOP.Home_Work.Task_6.Model.Teacher;
import OOP.Home_Work.Task_6.Model.UserComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public void createStudentGroup(Teacher teacher, List<Student> students) {
        this.studentGroup = new StudentGroup(teacher, students);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public Student getStudentFromStudentGroup(String firstName, String secondName){
        Iterator<Student> iterator = studentGroup.iterator();
        List<Student> result = new ArrayList<>();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getFirstName().equalsIgnoreCase(firstName)
                    && student.getSecondName().equalsIgnoreCase(secondName)){
                result.add(student);
            }
        }
        if(result.size() == 0){
            throw new IllegalStateException(
                    String.format("Студент с именем %s и фамилией %s не найден", firstName, secondName)
            );
        }
        if(result.size() != 1){
            throw new IllegalStateException("Найдено более одного студента с указанными именем и фамилией");
        }
        return result.get(0);
    }

    public List<Student> getSortedStudentGroup(){
        List<Student> students = new ArrayList<>(studentGroup.getStudents());
        Collections.sort(students);
        return students;
    }

    public List<Student> getSortedByFIOStudentGroup(){
        List<Student> students = new ArrayList<>(studentGroup.getStudents());
        students.sort(new UserComparator<Student>());
        return students;
    }
}
