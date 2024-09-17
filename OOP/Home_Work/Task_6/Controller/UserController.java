package OOP.Home_Work.Task_6.Controller;


import java.time.LocalDate;

public interface UserController<T>{
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
