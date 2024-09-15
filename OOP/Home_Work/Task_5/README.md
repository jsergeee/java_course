Для реализации поставленной задачи на основе принципов ООП необходимо создать структуру классов для управления студентами, преподавателями, учебными группами и сервисами, которые обрабатывают соответствующие данные. Ниже приведён код на основе классов, разделённых на группы: `Model`, `Controller`, `Service`, и `View`.

### Группа `Model`:

1. **Класс `User`** — базовый класс для всех пользователей:

```java
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
```

2. **Класс `Student`** — наследник `User`, содержащий дополнительное поле `studentId`:

```java
package OOP.Home_Work.Task_5.Model;

import java.time.LocalDate;

public class Student extends User {
    private Long studentId;

    public Student(Long studentId, String firstName, String lastName, LocalDate dateOfBirth) {
        super(firstName, lastName, dateOfBirth);
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }
}
```

3. **Класс `Teacher`** — наследник `User` с возможностью добавления специфичных для преподавателя данных:

```java
package OOP.Home_Work.Task_5.Model;

import java.time.LocalDate;

public class Teacher extends User {
    private Long teacherId;

    public Teacher(Long teacherId, String firstName, String lastName, LocalDate dateOfBirth) {
        super(firstName, lastName, dateOfBirth);
        this.teacherId = teacherId;
    }

    public Long getTeacherId() {
        return teacherId;
    }
}
```

4. **Класс `StudentGroup`** — группа студентов и преподаватель:

```java
package OOP.Home_Work.Task_5.Model;

import java.util.List;

public class StudentGroup {
    private Teacher teacher;
    private List<Student> students;

    public StudentGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }
}
```

5. **Интерфейс `Comparator` для сравнения пользователей:**

```java
package OOP.Home_Work.Task_5.Model;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User u1, User u2) {
        return u1.getLastName().compareTo(u2.getLastName());
    }
}
```

6. **Итератор для перебора группы студентов:**

```java
package OOP.Home_Work.Task_5.Model;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private List<Student> students;
    private int position = 0;

    public StudentGroupIterator(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return position < students.size();
    }

    @Override
    public Student next() {
        return students.get(position++);
    }
}
```

### Группа `Controller`:

1. **Интерфейс `UserController`**:

```java
package OOP.Home_Work.Task_5.Controller;

public interface UserController<T> {
    void create(T user);
}
```

2. **Класс `StudentController`**:

```java
package OOP.Home_Work.Task_5.Controller;

import OOP.Home_Work.Task_5.Model.Student;
import OOP.Home_Work.Task_5.Servise.StudentService;

public class StudentController implements UserController<Student> {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void create(Student student) {
        studentService.createStudent(student);
    }

    public Student getStudentById(Long id) {
        return studentService.getStudentById(id);
    }
}
```

3. **Класс `TeacherController`**:

```java
package OOP.Home_Work.Task_5.Controller;

import OOP.Home_Work.Task_5.Model.Teacher;
import OOP.Home_Work.Task_5.Servise.TeacherService;

public class TeacherController implements UserController<Teacher> {
    private TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public void create(Teacher teacher) {
        teacherService.createTeacher(teacher);
    }

    public Teacher getTeacherById(Long id) {
        return teacherService.getTeacherById(id);
    }
}
```

4. **Класс `StudyGroupController`**:

```java
package OOP.Home_Work.Task_5.Controller;

import OOP.Home_Work.Task_5.Model.Student;
import OOP.Home_Work.Task_5.Model.StudentGroup;
import OOP.Home_Work.Task_5.Model.Teacher;

import java.util.List;

public class StudyGroupController {
    public StudentGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return new StudentGroup(teacher, students);
    }
}
```

### Группа `Service`:

1. **Интерфейс `UserService`**:

```java
package OOP.Home_Work.Task_5.Servise;

public interface UserService<T> {
    void create(T user);
}
```

2. **Класс `StudentService`**:

```java
package OOP.Home_Work.Task_5.Servise;

import OOP.Home_Work.Task_5.Model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student> {
    private List<Student> students = new ArrayList<>();

    @Override
    public void create(Student student) {
        students.add(student);
    }

    public Student getStudentById(Long id) {
        return students.stream()
                .filter(student -> student.getStudentId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Student> getAllStudents() {
        return students;
    }
}
```

3. **Класс `TeacherService`**:

```java
package OOP.Home_Work.Task_5.Servise;

import OOP.Home_Work.Task_5.Model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {
    private List<Teacher> teachers = new ArrayList<>();

    @Override
    public void create(Teacher teacher) {
        teachers.add(teacher);
    }

    public Teacher getTeacherById(Long id) {
        return teachers.stream()
                .filter(teacher -> teacher.getTeacherId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Teacher> getAllTeachers() {
        return teachers;
    }
}
```

4. **Класс `StudyGroupService`**:

```java
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
```

### Группа `View`:

1. **Интерфейс `UserView`**:

```java
package OOP.Home_Work.Task_5.View;

public interface UserView<T> {
    void display(T user);
}
```

2. **Класс `StudentView`**:

```java
package OOP.Home_Work.Task_5.View;

import OOP.Home_Work.Task_5.Model.Student;

public class StudentView implements UserView<Student> {
    @Override
    public void display(Student student) {
        System.out.println("Student: " + student.getFirstName() + " " + student.getLastName());
    }
}
```

3. **Класс `TeacherView`**:

```java
package OOP.Home_Work.Task_5.View;

import OOP.Home_Work.Task_5.Model.Teacher;

public class TeacherView implements UserView<Teacher> {
    @Override
    public void display(Teacher teacher) {
        System.out.println("Teacher: " + teacher.getFirstName() + " " + teacher.getLastName());
    }
}
```

### Класс `Main`:

```java
package OOP.Home_Work.Task_5.View;

import OOP.Home_Work.Task_5.Controller.StudentController;
import OOP.Home_Work.Task_5.Controller.StudyGroupController;
import OOP.Home_Work.Task_5.Controller.TeacherController;
import OOP.Home_Work.Task_5.Model.Student;
import OOP.Home_Work.Task_5.Model.StudentGroup;
import OOP.Home_Work.Task_5.Model.Teacher;
import OOP.Home_Work.Task_5.Servise.StudentService;
import OOP.Home_Work.Task_5.Servise.TeacherService;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Инициализация сервисов
        StudentService studentService = new StudentService();
        TeacherService teacherService = new TeacherService();

        // Инициализация контроллеров
        StudentController studentController = new StudentController(studentService);
        TeacherController teacherController = new TeacherController(teacherService);
        StudyGroupController studyGroupController = new StudyGroupController();

        // Добавляем студентов и преподавателей
        studentController.create(new Student(1L, "Alice", "Brown", LocalDate.of(2000, 1, 1)));
        studentController.create(new Student(2L, "Bob", "Smith", LocalDate.of(2000, 2, 2)));
        teacherController.create(new Teacher(1L, "John", "Doe", LocalDate.of(1980, 3, 3)));

        // Создаем учебную группу
        Teacher teacher = teacherController.getTeacherById(1L);
        Student student1 = studentController.getStudentById(1L);
        Student student2 = studentController.getStudentById(2L);

        StudentGroup group = studyGroupController.createStudyGroup(teacher, Arrays.asList(student1, student2));

        // Отображение данных
        StudentView studentView = new StudentView();
        TeacherView teacherView = new TeacherView();

        teacherView.display(group.getTeacher());
        group.getStudents().forEach(studentView::display);
    }
}
```

Этот код организован по принципам ООП и включает все классы и интерфейсы, необходимые для управления учебными группами, студентами и преподавателями.