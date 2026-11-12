package recursion;

public class Recursion {

    public static void main(String[] args) {

        System.out.println("Recursion");

        // Print numbers from 1 to 4
        printNumbersFromStart(1);

        // Print numbers from 5 to 1
        printNumberReverse(5);

        // Factorial of a number
        System.out.println("Factorial: " + fact(5));

        // Sum of digits
        System.out.println("Sum of Digits: " + sumOfDigits(5234));

        // Product of digits
        System.out.println("Product of Digits: " + productOfDigits(5234));

        // Reverse number using static variable
        System.out.println("Reverse Digits: " + reverseDigits(5234));

        // Reverse number using parameter passing
        System.out.println("Reverse Digits (Optimized): " + reverseDigits1(5234));
    }

    // Print numbers from 1 to 4
    static void printNumbersFromStart(int n) {

        if (n == 5) {
            return;
        }

        System.out.println(n);

        printNumbersFromStart(n + 1);
    }

    // Print numbers from 5 to 1
    static void printNumberReverse(int n) {

        System.out.println(n);

        if (n == 1) {
            return;
        }

        printNumberReverse(n - 1);
    }

    // Find factorial using recursion
    static int fact(int n) {

        if (n == 1) {
            return 1;
        }

        return n * fact(n - 1);
    }

    // Find sum of digits using recursion
    static int sumOfDigits(int n) {

        if (n % 10 == n) {
            return n;
        }

        return (n % 10) + sumOfDigits(n / 10);
    }

    // Find product of digits using recursion
    static int productOfDigits(int n) {

        if (n % 10 == n) {
            return n;
        }

        return (n % 10) * productOfDigits(n / 10);
    }

    // Reverse digits using a static variable
    static int rev = 0;

    static int reverseDigits(int n) {

        if (n == 0) {
            return rev;
        }

        int digit = n % 10;

        rev = rev * 10 + digit;

        return reverseDigits(n / 10);
    }

    // Reverse digits using parameter passing
    static int reverseDigits1(int n) {

        int rev = 0;

        return revDigit(n, rev);
    }

    static int revDigit(int n, int re) {

        if (n == 0) {
            return re;
        }

        int digit = n % 10;

        re = re * 10 + digit;

        return revDigit(n / 10, re);
    }
}
