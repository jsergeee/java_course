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