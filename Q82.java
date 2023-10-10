import java.util.*;
public class Q82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        boolean isGoodNumber = true;
        for (int i = 0; i < number / 10; i++) {
            if (i % 2 == 0 && number % 10 != 0) {
                isGoodNumber = false;
                break;
            } else if (i % 2 != 0 && (number % 10 != 2 && number % 10 != 3 && number % 10 != 5 && number % 10 != 7)) {
                isGoodNumber = false;
                break;
            }
            number /= 10;
        }

        if (isGoodNumber) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

}
