import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
  private List<Integer> f;

  public Fibonacci() {
    f = new ArrayList();
    f.add(0);
    f.add(1);
  }

  public int fib(int N) {

    if (N < f.size())
      return f.get(N);
    for (int i = f.size(); i <= N; i++) {
      f.add(f.get(i - 1) + f.get(i - 2));
    }
    return f.get(N);
  }
}
