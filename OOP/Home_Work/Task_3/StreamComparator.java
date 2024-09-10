package OOP.Home_Work.Task_3;

import java.util.Comparator;

// Класс StreamComparator
public class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream stream1, Stream stream2) {
        return Integer.compare(stream1.getNumberOfGroups(), stream2.getNumberOfGroups());
    }
}
