 import java.util.Scanner;
public class Q44 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();
    sc.close();
    int sum = 0;
    for (int i = 0; i < 3; i++) {
      sum += n % 10;
      n /= 10;
    }
    System.out.println("The sum of the last 3 digits is " + sum);
  }
}


