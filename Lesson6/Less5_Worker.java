package Lesson6;

public class Less5_Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        return String.format("%d %s %s %d", id, firstName, lastName, salary);
    }

    @Override
    public boolean equals(Object o) {
        var t = (Less5_Worker) o;
        return id == t.id && firstName == t.firstName;
    }
    @Override
    public int hashCode() {
        return id;
    }
}
