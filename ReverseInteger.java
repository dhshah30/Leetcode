
class ReverseInteger {


    public int reverse(int x) {
      if (x == 0) return 0;
      long r = 0;
      while (x != 0) {
        r = r * 10 + x % 10;
        if (r > Integer.MAX_VALUE || r < Integer.MIN_VALUE)
          return 0;
        x /= 10;
      }
      return (int) r;
    }
  }

