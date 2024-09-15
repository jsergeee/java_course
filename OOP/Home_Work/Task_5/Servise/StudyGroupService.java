package OOP.Home_Work.Task_5.Servise;

import OOP.Home_Work.Task_5.Model.Student;
import OOP.Home_Work.Task_5.Model.StudentGroup;
import OOP.Home_Work.Task_5.Model.Teacher;

import java.util.List;

public class StudyGroupService {
    public StudentGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return new StudentGroup(teacher, students);
    }
}