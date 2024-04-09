package problems;

import java.util.Scanner;

public class ProblemThird {
    /**
     * @param n number to check if it is prime
     * @return true if n is prime, false otherwise
     * Time complexity of the algorithm is O(n)
     * The function checks if n is divisible by any number from 2 to n
     * If it is divisible by any number, it is not prime
     * If it is not divisible by any number, it is prime
     *
     */
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;

        }
        return true;
    }

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean solution = isPrime(n);
        System.out.println(solution);
    }
}

