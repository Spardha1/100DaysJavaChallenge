public class Q52 {
        public static int fact(int n) {
            if (n == 0) {
                return 1;
            } else {
                return n * fact(n - 1);
            }
        }
    
        public static void main(String[] args) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("The factorial of " + i + " is: " + fact(i));
            }
        }
    }
