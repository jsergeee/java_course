package OOP.Home_Work.Task_5.Model;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User u1, User u2) {
        return u1.getLastName().compareTo(u2.getLastName());
    }
}