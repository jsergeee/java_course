package OOP.Home_Work.Task_5.Model;

import OOP.Home_Work.Task_4.Model.Student;
import OOP.Home_Work.Task_4.Model.Teacher;

import java.util.List;

public class StudyGroup {
    private OOP.Home_Work.Task_4.Model.Teacher teacher;
    private List<OOP.Home_Work.Task_4.Model.Student> students;

    public StudyGroup(OOP.Home_Work.Task_4.Model.Teacher teacher, List<OOP.Home_Work.Task_4.Model.Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public OOP.Home_Work.Task_4.Model.Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<OOP.Home_Work.Task_4.Model.Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "teacher=" + teacher +
                ", students=" + students +
                '}';
    }
}
