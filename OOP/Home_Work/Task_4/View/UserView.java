package OOP.Home_Work.Task_4.View;

import OOP.Home_Work.Task_4.Model.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
