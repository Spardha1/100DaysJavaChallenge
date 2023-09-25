import java.util.HashSet;
import java.util.Scanner;

public class q12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three subject numbers: ");
        int subject1 = scanner.nextInt();
        int subject2 = scanner.nextInt();
        int subject3 = scanner.nextInt();

        HashSet<Integer> hs = new HashSet<>();
        hs.add(subject1);
        hs.add(subject2);
        hs.add(subject3);

        for (Integer sub : hs) {
            System.out.println("Distinct subject number: " + sub);
        }
    }
}