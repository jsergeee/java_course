package OOP.Home_Work.Task_4.View;

import OOP.Home_Work.Task_4.Data.Student;
import OOP.Home_Work.Task_4.Data.StudentGroup;


import java.util.List;
import java.util.logging.Logger;

public class StudentView implements UserView<Student>{

    Logger logger = Logger.getLogger(StudentView.class.getName());


@Override
public void sendOnConsole(List<Student> students) {
    for(Student user: students){
        logger.info(user.toString());
    }
}

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }

//    public void sendOnConsole(List<Student> all) {
//    }
}
