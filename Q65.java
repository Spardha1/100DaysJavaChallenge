public class Q65 {
    public static int sumOfFactors(int number) {
        int sumOfFactors = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sumOfFactors += i;
            }
        }
        return sumOfFactors;
    }

    public static void main(String[] args) {
        int number = 12;

        int sumOfFactors = sumOfFactors(number);
        System.out.println("The sum of the factors of " + number + " is " + sumOfFactors);
    }
}
