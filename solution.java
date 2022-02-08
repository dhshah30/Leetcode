public class solution {
  public int[] smallerNumbersThanCurrent(int[] num) {
    int[] countList = new int[101];
    int[] r = new int[num.length];
    // count numbers
    for (int i = 0; i < num.length; i++)
      countList[num[i]]++;
    // compute numbers before current index
    for (int i = 1; i < 101; i++)
      countList[i] += countList[i-1];
    for (int i = 0; i < num.length; i++) {
      if (num[i] == 0) r[i] = 0;
      else r[i] = countList[num[i]-1];
    }
    return r;
  }
}
