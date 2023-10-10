
public class Q85 {
        public static int findHCF(int a, int b) {
            if (a == 0 || b == 0) {
                return 0;
            }
    
            while (a != b) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }
    
            return a;
        }
    
        public static void main(String[] args) {
            System.out.println("HCF of 20 and 28 is: " + findHCF(20, 28));
            
        }
    }
    
