package OOP.Home_Work.Task_4.Servise;

import java.time.LocalDate;
import java.util.List;

public interface UserService<T> {
    List<T> getAll();
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
