//Данный код соответствует принципу единственной ответственности (SRP), так как класс `TeacherView` отвечает только за вывод списка учителей на консоль.
//Код также соответствует принципу открытости/закрытости (OCP), так как класс закрыт для изменений, но открыт для расширения, и его можно использовать для вывода списка учителей в различных форматах.
//Код также соответствует принципу подстановки Барбары Лисков (LSP), так как класс `TeacherView` реализует интерфейс `UserView<Teacher>`, который используется для вывода списка учителей.
//Принцип разделения интерфейса (ISP) применен, так как класс реализует только необходимый метод интерфейса `UserView<Teacher>`.
//Принцип инверсии зависимостей (DIP) также применен, так как класс `TeacherView` зависит только от абстрактного типа данных (`UserView<Teacher>`) в своих полях и методах, а не от конкретных реализаций. Это позволяет легко заменять реализацию интерфейса `UserView<Teacher>` на другую, не меняя код класса `TeacherView`.

package OOP.Home_Work.Task_6.View;



import OOP.Home_Work.Task_6.Model.Teacher;

import java.util.List;
import java.util.logging.Logger;

public class TeacherView implements UserView<Teacher> {

    Logger logger = Logger.getLogger(TeacherView.class.getName());

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for(Teacher teacher: teachers){
            logger.info(teacher.toString());
        }
    }
}
