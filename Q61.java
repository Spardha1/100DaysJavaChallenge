public class Q61 {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int sumOfFactorialsOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += factorial(number % 10);
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 234;
        int sumOfFactorials = sumOfFactorialsOfDigits(number);
        System.out.println("The sum of the factorials of the individual digits of " + number + " is " + sumOfFactorials);
    }
}


