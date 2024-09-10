package OOP.Home_Work.Task_3;

import java.util.List;

// Класс Controller
public class Controller {
    private StreamService streamService;

    public Controller() {
        this.streamService = new StreamService();
    }

    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams);
    }
}
