package problems;

public class ProblemFour {
    /**
     * @param n the number to calculate the factorial of
     * @return the factorial of n
     * This recursive function calculates the factorial of a given number n.
     * If n is 0, it returns 1, as the factorial of 0 is defined to be 1. Otherwise, it multiplies n by the result of recursively calling the function with n-1.
     * The recursion continues until n reaches 0. Then, it starts returning back, multiplying each return value by the current n, until it reaches the initial call.
     */
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void solve() {
        int n = 5;
        int solution = factorial(n);
        System.out.println(solution);
    }

}
