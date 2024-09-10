package OOP.Home_Work.Task_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем несколько учебных групп
        StudyGroup group1 = new StudyGroup("Group1");
        StudyGroup group2 = new StudyGroup("Group2");
        StudyGroup group3 = new StudyGroup("Group3");

        // Создаем несколько потоков
        Stream stream1 = new Stream();
        stream1.addGroup(group1);
        stream1.addGroup(group2);

        Stream stream2 = new Stream();
        stream2.addGroup(group3);

        Stream stream3 = new Stream();
        stream3.addGroup(group1);
        stream3.addGroup(group2);
        stream3.addGroup(group3);

        // Создаем список потоков
        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);

        // Создаем контроллер и сортируем потоки
        Controller controller = new Controller();
        controller.sortStreams(streams);

        // Выводим результаты
        for (Stream stream : streams) {
            System.out.println("Stream with " + stream.getNumberOfGroups() + " groups");
        }
    }
}
