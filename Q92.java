public class Q92 {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            if (i <= 6) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = i; j <= 12; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        System.out.println("JAVA");
    }
}
