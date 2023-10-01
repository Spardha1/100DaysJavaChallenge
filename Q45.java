public class Q45 {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i <= 40; i++) {
      if (i % 3 == 0) {
        sum += i;
      }
    }
    System.out.println("The sum of multiples of 3 between 1 and 40 is " + sum);
  }
}

