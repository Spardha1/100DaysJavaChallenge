/* "5. Enter 3 student marks and provide grade of the student.
0 - 40 -> C, 41 - 75 -> B, 76 - 100 -> A"*/
import java.util.*;
public class q15{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int  t = (a+b+c)/3;
        if(0<=t && t<=40){
            System.out.println("C");
        }
        else if(41<=t && t<=75){
             System.out.println("B");
        }
        else if(76<=t && t<=100){
             System.out.println("A");

        }
        else{
             System.out.println("Not valid");
        }
    }
}