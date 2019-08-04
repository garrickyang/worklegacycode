package after.legacycode.changecode.newmethod;

import java.util.LinkedList;
import java.util.List;

public class ManagerList {
    private List<Entry> entrys = new LinkedList<Entry>();

    public void add(List<Entry> entries){
        entries.addAll(entrys);
    }

    public boolean hasEntry(Entry entry){
        return entrys.contains(entry);
    }
}
