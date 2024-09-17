//Данный код также соответствует принципу единственной ответственности (SRP). Класс User отвечает только за хранение информации о пользователе, класс Teacher отвечает за информацию о преподавателе и имеет дополнительное поле teacherId, а класс Student отвечает за информацию о студенте и имеет дополнительное поле studentId.
//Также код соответствует принципу открытости/закрытости (OCP), так как классы не содержат методов, которые бы изменяли их поля, а также не являются базовыми классами для других классов.
//Код также соответствует принципу подстановки Барбары Лисков (LSP), так как классы User, Teacher и Student могут использоваться взаимозаменяемо.
//Принцип разделения интерфейса (ISP) не применен, так как классы не реализуют никаких интерфейсов.
//Принцип инверсии зависимостей (DIP) также не применен, так как классы зависят от конкретных типов данных (String, LocalDate, Long, Comparator) в своих полях и методах. Однако, это не всегда является проблемой, особенно если классы используются только внутри одного модуля.

package OOP.Home_Work.Task_6.Model;



import java.time.LocalDate;

public class User {
    private String firstName;
    private String secondName;
    private String patronymic;
    private LocalDate dateOfBirth;

    public User(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }

        User user = (User) o;

        if (getFirstName() != null ? !getFirstName().equals(user.getFirstName()) :
                user.getFirstName() != null) {
            return false;
        }
        if (getSecondName() != null ? !getSecondName().equals(user.getSecondName()) :
                user.getSecondName() != null) {
            return false;
        }
        if (getPatronymic() != null ? !getPatronymic().equals(user.getPatronymic()) :
                user.getPatronymic() != null) {
            return false;
        }
        return getDateOfBirth() != null ? getDateOfBirth().equals(user.getDateOfBirth()) :
                user.getDateOfBirth() == null;
    }
}
