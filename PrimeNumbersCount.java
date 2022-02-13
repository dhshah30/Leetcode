import java.util.Arrays;

public class PrimeNumbersCount {
  public int countPrimes(int n) {
    boolean[] prime = new boolean[n];
    int count = 0;
    Arrays.fill(prime, true);
    for (int i = 2; i < n; i++) {
      if (i * i >= n)
        break;
      if (!prime[i])
        continue;
      for (int j = i * i; j < n; j += i)
        prime[j] = false;
    }
    for (int i = 2; i < n; i++)
      if (prime[i])
        count++;
    return count;
  }

}
