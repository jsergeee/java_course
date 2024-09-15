package OOP.Home_Work.Task_5.View;

import OOP.Home_Work.Task_5.Model.Student;
import OOP.Home_Work.Task_5.Model.StudentGroup;

import java.util.List;
import java.util.logging.Logger;

public class StudentView implements UserView<Student> {

    Logger logger = Logger.getLogger(StudentView.class.getName());



public void sendOnConsole(List<Student> students) {
    for(Student user: students){
        logger.info(user.toString());
    }
}

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }

    @Override
    public void display(Student user) {

    }

//    public void sendOnConsole(List<Student> all) {
//    }
}
