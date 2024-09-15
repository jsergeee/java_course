package OOP.Home_Work.Task_4.Servise;

import OOP.Home_Work.Task_4.Data.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {

    private final List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (Teacher teacher: teachers){
            if (teacher.getTeacherId() > countMaxId){
                countMaxId = teacher.getTeacherId();
            }
        }
        countMaxId++;
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        teachers.add(teacher);
    }

    public void update(Teacher teacherToUpdate, String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        teacherToUpdate.setFirstName(firstName);
        teacherToUpdate.setSecondName(secondName);
        teacherToUpdate.setPatronymic(patronymic);
        teacherToUpdate.setDateOfBirth(dateOfBirth);
    }
}
