import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Restaurant {
    String name;
    List<Table> tableList = new ArrayList<Table>();
    Queue<Party> waitlist = new LinkedList<Party>();

    public List<Table> getTableList() {
        return tableList;
    }
    public Queue<Party> getWaitlist() {
        return waitlist;
    }
}
