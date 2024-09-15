package OOP.Home_Work.Task_5.Servise;

import OOP.Home_Work.Task_5.Model.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teachers = new ArrayList<>();
    private long teacherIdCounter = 1;

    public void create(String firstName, String lastName, String patronymic, LocalDate dateOfBirth) {
        Teacher teacher = new Teacher(teacherIdCounter++, firstName, lastName, patronymic, dateOfBirth);
        teachers.add(teacher);
    }

    public List<Teacher> getAll() {
        return teachers;
    }

    public Teacher getById(Long id) {
        return teachers.stream()
                .filter(teacher -> teacher.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}