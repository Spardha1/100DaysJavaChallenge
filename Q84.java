public class Q84 {
        public static int findLCM(int a, int b) {
            int lcm = Math.max(a, b);
            while (lcm % a != 0 || lcm % b != 0) {
                lcm++;
            }
            return lcm;
        }
    
        public static void main(String[] args) {
            int a = 15;
            int b = 20;
            System.out.println("LCM of 15 and 20 is: " + findLCM(a,b));
          
        }
    }

