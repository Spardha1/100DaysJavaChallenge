import java.util.*;
public class q11{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double sal = sc.nextDouble();
        int mon = sc.nextInt();
       
      if(mon==4 || mon==6 || mon==8 || mon==10){
         sal = sal/30;
        System.out.println(sal);
        
      }
      if(mon==1 || mon==3 || mon==5 || mon==6||mon==7||mon==8||mon==10||mon==12){
         sal = sal/30;
        System.out.println(sal);
        
      }
      if(mon==2){
        sal = sal/28;
        System.out.println(sal);
      }
        

        

    }
}