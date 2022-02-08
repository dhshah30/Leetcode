import java.util.TreeSet;

public class RecentCounter {
  TreeSet<Integer> treeSet;
  public RecentCounter() {
    treeSet = new TreeSet();
  }

  public int ping(int t) {
    treeSet.add(t);
    return treeSet.tailSet(t-3000).size();
  }
}
