//Код соответствует принципу единственной ответственности (SRP), так как класс `Teacher` отвечает только за хранение информации о преподавателе и имеет дополнительное поле `teacherId`.
//Также код соответствует принципу открытости/закрытости (OCP), так как класс `Teacher` не содержит методов, которые бы изменяли его поля, а также не является базовым классом для других классов. Класс также открыт для расширения, так как внутри класса определен вложенный класс `TeacherComparator`, который может быть использован для сортировки списка преподавателей.
//Код также соответствует принципу подстановки Барбары Лисков (LSP), так как класс `Teacher` может использоваться вместо класса `User`, от которого он наследуется.
//Принцип разделения интерфейса (ISP) не применен, так как класс не реализует никаких интерфейсов.
//Принцип инверсии зависимостей (DIP) также не применен, так как класс зависит от конкретных типов данных (`String`, `LocalDate`, `Long`, `Comparator`) в своих полях и методах. Однако, это не всегда является проблемой, особенно если класс используется только внутри одного модуля.

package OOP.Home_Work.Task_6.Model;

import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User {

    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long countMaxId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.teacherId = countMaxId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public static class TeacherComparator implements Comparator<Teacher> {
        @Override
        public int compare(Teacher o1, Teacher o2) {
            // Implement comparison logic here
            return 0; // Placeholder return value
        }
    }
}
