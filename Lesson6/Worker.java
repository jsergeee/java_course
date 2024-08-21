package Lesson6;

public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;


// меняем базовое поведение методов  =toString, equals и hashCode
    public String toString() {
        return String.format("%d %s %s %d", id, firstName, lastName, salary);
    }

    public boolean equals(Object o) {
        var t = (Worker) o;
        return id == t.id && firstName == t.firstName;
    }

    public int hashCode() {
        return id;
    }
}
