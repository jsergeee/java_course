Выполнено ли задание?
— Создать класс УчебнаяГруппа, содержащий в себе поля Преподаватель и список Студентов;
— Создать класс УчебнаяГруппаСервис, в котором реализована функция (входные параметры - (Teacher, List<Strudent>)) формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его;
— Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id) и преподавателя (его id) и формирования учебной группы, путём вызова метода из сервиса;
— Всё вышеуказанное создать согласно принципам ООП

   ```java
package OOP.Home_Work.Task_4.Controller;

import OOP.Home_Work.Task_4.Model.Student;
import OOP.Home_Work.Task_4.Model.StudentGroupIterator;
import OOP.Home_Work.Task_4.Model.Teacher;
import OOP.Home_Work.Task_4.Servise.StudentGroupService;
import OOP.Home_Work.Task_4.Servise.TeacherService;
import OOP.Home_Work.Task_4.Servise.UserService;
import OOP.Home_Work.Task_4.View.StudentView;
import OOP.Home_Work.Task_4.Servise.StudentService;
import OOP.Home_Work.Task_4.View.TeacherView;

import java.time.LocalDate;
import java.util.*;

public class StudentController {

    private final StudentService dataService = new StudentService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView studentView = new StudentView();


    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        studentView.sendOnConsole(dataService.getAll());
    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);
        studentView.sendOnConsoleUserGroup(studentGroupService.getStudentGroup());
    }

    public void getStudentInStudentGroup(String firstName, String secondName){
        Student student = studentGroupService.getStudentFromStudentGroup(firstName, secondName);
        studentView.sendOnConsole(Collections.singletonList(student));
    }

    public void getSortedListStudentFromStudentGroup(){
        List<Student> students = studentGroupService.getSortedStudentGroup();
        studentView.sendOnConsole(students);
    }

    public void getSortedListByFIOStudentFromStudentGroup(){
        List<Student> students = studentGroupService.getSortedByFIOStudentGroup();
        studentView.sendOnConsole(students);
    }
}


package OOP.Home_Work.Task_4.Controller;



import OOP.Home_Work.Task_4.Model.Teacher;
import OOP.Home_Work.Task_4.Servise.TeacherService;
import OOP.Home_Work.Task_4.View.TeacherView;

import java.time.LocalDate;
import java.util.List;

public class TeacherController {

    private final TeacherService teacherService;
    private final TeacherView teacherView;

    public TeacherController(TeacherService teacherService, TeacherView teacherView) {
        this.teacherService = teacherService;
        this.teacherView = teacherView;
    }

    public void createTeacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        teacherService.create(firstName, secondName, patronymic, dateOfBirth);
    }

    public void updateTeacher(Teacher teacherToUpdate, String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        teacherService.update(teacherToUpdate, firstName, secondName, patronymic, dateOfBirth);
    }

    public void showAllTeachers() {
        List<Teacher> teachers = teacherService.getAll();
        teacherView.sendOnConsole(teachers);
    }
}


package OOP.Home_Work.Task_4.Controller;


import java.time.LocalDate;

public interface UserController<T extends User>{
void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}


package OOP.Home_Work.Task_4.Model;

import java.time.LocalDate;

public class Student extends OOP.Home_Work.Task_4.Model.User implements Comparable<OOP.Home_Work.Task_4.Model.Student>{
private Long studentId;

    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long studentId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId +'\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                '}';
    }

    @Override
    public int compareTo(OOP.Home_Work.Task_4.Model.Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}


package OOP.Home_Work.Task_4.Model;

import java.util.List;

public class StudentGroup implements Iterable<OOP.Home_Work.Task_4.Model.Student>{
private List<OOP.Home_Work.Task_4.Model.Student> students;
private Teacher teacher;

    public StudentGroup(Teacher teacher, List<OOP.Home_Work.Task_4.Model.Student> students) {
        this.students = students;
        this.teacher = teacher;
    }

    public List<OOP.Home_Work.Task_4.Model.Student> getStudents() {
        return students;
    }

    public void setStudents(List<OOP.Home_Work.Task_4.Model.Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                ", teacher=" + teacher +
                '}';
    }

    @Override
    public StudentGroupIterator iterator() {
        return new StudentGroupIterator(this);
    }
}


package OOP.Home_Work.Task_4.Model;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<OOP.Home_Work.Task_4.Model.Student> {

    private int counter;
    private final List<OOP.Home_Work.Task_4.Model.Student> students;

    public StudentGroupIterator(OOP.Home_Work.Task_4.Model.StudentGroup studentGroup) {
        this.students = studentGroup.getStudents();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size() - 1;
    }

    @Override
    public OOP.Home_Work.Task_4.Model.Student next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return students.get(counter);
    }
}


package OOP.Home_Work.Task_4.Model;

import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends OOP.Home_Work.Task_4.Model.User {

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

    public static class TeacherComparator implements Comparator<OOP.Home_Work.Task_4.Model.Teacher> {
        @Override
        public int compare(OOP.Home_Work.Task_4.Model.Teacher o1, OOP.Home_Work.Task_4.Model.Teacher o2) {
            // Implement comparison logic here
            return 0; // Placeholder return value
        }
    }
}


package OOP.Home_Work.Task_4.Model;



import java.time.LocalDate;

public class User {
private String firstName;
private String secondName;
private String patronymic;
private LocalDate dateOfBirth;

    public User(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OOP.Home_Work.Task_4.Model.User)) {
            return false;
        }

        OOP.Home_Work.Task_4.Model.User user = (OOP.Home_Work.Task_4.Model.User) o;

        if (getFirstName() != null ? !getFirstName().equals(user.getFirstName()) :
                user.getFirstName() != null) {
            return false;
        }
        if (getSecondName() != null ? !getSecondName().equals(user.getSecondName()) :
                user.getSecondName() != null) {
            return false;
        }
        if (getPatronymic() != null ? !getPatronymic().equals(user.getPatronymic()) :
                user.getPatronymic() != null) {
            return false;
        }
        return getDateOfBirth() != null ? getDateOfBirth().equals(user.getDateOfBirth()) :
                user.getDateOfBirth() == null;
    }
}



package OOP.Home_Work.Task_4.Model;

import java.util.Comparator;

public class UserComparator<T extends OOP.Home_Work.Task_4.Model.User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultOfComparing == 0) {
                return o1.getPatronymic().compareTo(o2.getPatronymic());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}


package OOP.Home_Work.Task_4.Servise;




import OOP.Home_Work.Task_4.Model.Student;
import OOP.Home_Work.Task_4.Model.StudentGroup;
import OOP.Home_Work.Task_4.Model.Teacher;
import OOP.Home_Work.Task_4.Model.UserComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupService {
private OOP.Home_Work.Task_4.Model.StudentGroup studentGroup;

    public void createStudentGroup(OOP.Home_Work.Task_4.Model.Teacher teacher, List<OOP.Home_Work.Task_4.Model.Student> students) {
        this.studentGroup = new OOP.Home_Work.Task_4.Model.StudentGroup(teacher, students);
    }

    public OOP.Home_Work.Task_4.Model.StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public OOP.Home_Work.Task_4.Model.Student getStudentFromStudentGroup(String firstName, String secondName){
        Iterator<OOP.Home_Work.Task_4.Model.Student> iterator = studentGroup.iterator();
        List<OOP.Home_Work.Task_4.Model.Student> result = new ArrayList<>();
        while (iterator.hasNext()){
            OOP.Home_Work.Task_4.Model.Student student = iterator.next();
            if(student.getFirstName().equalsIgnoreCase(firstName)
                    && student.getSecondName().equalsIgnoreCase(secondName)){
                result.add(student);
            }
        }
        if(result.size() == 0){
            throw new IllegalStateException(
                    String.format("Студент с именем %s и фамилией %s не найден", firstName, secondName)
            );
        }
        if(result.size() != 1){
            throw new IllegalStateException("Найдено более одного студента с указанными именем и фамилией");
        }
        return result.get(0);
    }

    public List<OOP.Home_Work.Task_4.Model.Student> getSortedStudentGroup(){
        List<OOP.Home_Work.Task_4.Model.Student> students = new ArrayList<>(studentGroup.getStudents());
        Collections.sort(students);
        return students;
    }

    public List<OOP.Home_Work.Task_4.Model.Student> getSortedByFIOStudentGroup(){
        List<OOP.Home_Work.Task_4.Model.Student> students = new ArrayList<>(studentGroup.getStudents());
        students.sort(new OOP.Home_Work.Task_4.Model.UserComparator<OOP.Home_Work.Task_4.Model.Student>());
        return students;
    }
}


package OOP.Home_Work.Task_4.Servise;

import OOP.Home_Work.Task_4.Model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<OOP.Home_Work.Task_4.Model.Student> {

    private final List<OOP.Home_Work.Task_4.Model.Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<OOP.Home_Work.Task_4.Model.Student> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (OOP.Home_Work.Task_4.Model.Student student: students){
            if (student.getStudentId() > countMaxId){
                countMaxId = student.getStudentId();
            }
        }
        countMaxId++;
        OOP.Home_Work.Task_4.Model.Student student = new OOP.Home_Work.Task_4.Model.Student(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        students.add(student);
    }
}


package OOP.Home_Work.Task_4.Servise;

import OOP.Home_Work.Task_4.Model.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<OOP.Home_Work.Task_4.Model.Teacher> {

    private final List<OOP.Home_Work.Task_4.Model.Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<OOP.Home_Work.Task_4.Model.Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (OOP.Home_Work.Task_4.Model.Teacher teacher: teachers){
            if (teacher.getTeacherId() > countMaxId){
                countMaxId = teacher.getTeacherId();
            }
        }
        countMaxId++;
        OOP.Home_Work.Task_4.Model.Teacher teacher = new OOP.Home_Work.Task_4.Model.Teacher(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        teachers.add(teacher);
    }

    public void update(OOP.Home_Work.Task_4.Model.Teacher teacherToUpdate, String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        teacherToUpdate.setFirstName(firstName);
        teacherToUpdate.setSecondName(secondName);
        teacherToUpdate.setPatronymic(patronymic);
        teacherToUpdate.setDateOfBirth(dateOfBirth);
    }
}


package OOP.Home_Work.Task_4.Servise;

import java.time.LocalDate;
import java.util.List;

public interface UserService<T> {
List<T> getAll();
void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
