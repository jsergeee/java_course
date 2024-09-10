package OOP.Home_Work.Task_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup> {
    private List<StudyGroup> groups;

    public Stream() {
        this.groups = new ArrayList<>();
    }

    public void addGroup(StudyGroup group) {
        groups.add(group);
    }

    public List<StudyGroup> getGroups() {
        return groups;
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return groups.iterator();
    }

    public int getNumberOfGroups() {
        return groups.size();
    }
}