package OOP.Home_Work.Task_4.Controller;


import java.time.LocalDate;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
