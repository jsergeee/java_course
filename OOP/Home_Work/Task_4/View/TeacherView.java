package OOP.Home_Work.Task_4.View;



import OOP.Home_Work.Task_4.Data.Teacher;

import java.util.List;
import java.util.logging.Logger;

public class TeacherView implements UserView<Teacher> {

    Logger logger = Logger.getLogger(TeacherView.class.getName());

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for(Teacher teacher: teachers){
            logger.info(teacher.toString());
        }
    }
}
