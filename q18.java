import java.util.Scanner;

public class q18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int weekNumber = sc.nextInt();

        
        if (weekNumber < 0 || weekNumber > 6) {
            System.out.println("Invalid week number.");
            return;
         }
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println(weekDays[weekNumber]);
    }
}
