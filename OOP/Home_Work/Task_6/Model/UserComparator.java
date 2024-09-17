//Данный код соответствует принципу единственной ответственности (SRP), так как класс `UserComparator` отвечает только за сравнение пользователей по ФИО.
//Также код соответствует принципу открытости/закрытости (OCP), так как класс открыт для расширения, и его можно использовать для сравнения любых классов, которые наследуются от класса `User`.
//Код также соответствует принципу подстановки Барбары Лисков (LSP), так как класс `UserComparator` может использоваться вместо класса `Comparator` для любых классов, которые наследуются от класса `User`.
//Принцип разделения интерфейса (ISP) не применен, так как класс не реализует никаких интерфейсов.
//Принцип инверсии зависимостей (DIP) также не применен, так как класс зависит от конкретного типа данных (`User`) в своих полях и методах. Однако, это не всегда является проблемой, особенно если класс используется только внутри одного модуля.

package OOP.Home_Work.Task_6.Model;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultOfComparing == 0) {
                return o1.getPatronymic().compareTo(o2.getPatronymic());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}
