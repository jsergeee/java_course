package OOP.Home_Work.Task_4_1;

import java.util.ArrayList;
import java.util.List;

class TeacherService {

    private List<Teacher> teachers;

    public TeacherService() {
       teachers = new ArrayList<>();
    }

    public void createTeacher(String name, String subject, int experience) {
        Teacher teacher = new Teacher(name, subject, experience);
        teachers.add(teacher);
        teachers.addFirst(new Teacher("Ivan","Mathem",3));
        teachers.add(new Teacher("Peter", "Geography", 15));
    }

    public void updateTeacher(int index, String name, String subject, int experience) {
        Teacher teacher = teachers.get(index);
        teacher.setName(name);
        teacher.setSubject(subject);
        teacher.setExperience(experience);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }



}
