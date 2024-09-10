package OOP.Home_Work.Task_3;

import java.util.Collections;
import java.util.List;

// Класс StreamService
public class StreamService {

    public void sortStreams(List<Stream> streams) {
        Collections.sort(streams, new StreamComparator());
    }
}
