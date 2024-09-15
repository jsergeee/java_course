package OOP.Home_Work.Task_5.Model;

import java.time.LocalDate;

public class Teacher {
    private Long id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private LocalDate dateOfBirth;

    public Teacher(Long id, String firstName, String lastName, String patronymic, LocalDate dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return String.format("Teacher [ID: %d, Name: %s %s %s, DOB: %s]", id, lastName, firstName, patronymic, dateOfBirth);
    }
}
