package OOP.Home_Work.Task_4.Data;

import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User {

    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long countMaxId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.teacherId = countMaxId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public static class TeacherComparator implements Comparator<Teacher> {
        @Override
        public int compare(Teacher o1, Teacher o2) {
            // Implement comparison logic here
            return 0; // Placeholder return value
        }
    }
}
