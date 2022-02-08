import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class RecentCounter {
  Queue<Integer> q;
  public RecentCounter() {
    q = new LinkedList();
  }

  public int ping(int y) {
    q.add(y);
    while (q.peek() < y - 3000)
      q.poll();
    return q.size();
  }
}
