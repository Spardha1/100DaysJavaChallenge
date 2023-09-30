import java.util.Scanner;

public class q36 {
    public static void main(String[] args){
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the  Maximum number");
        int maxLimit = scanner.nextInt();

        int count = 0;
        for (int i = 2; i <= maxLimit; i += 2) {
            count++;
            System.out.println(i);

            if (count == 10) {
                break;
            }
        }
    }
}

 