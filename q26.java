import java.util.Scanner;
public class q26 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int absValue = Math.abs(num);
        System.out.println("Absolute value is "+absValue);
    }
    
}
