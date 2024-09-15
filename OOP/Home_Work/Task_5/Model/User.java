package OOP.Home_Work.Task_5.Model;

import java.time.LocalDate;

public class User {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public User(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}