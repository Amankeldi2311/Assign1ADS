package problems;

public class ProblemFive {
    /**
     * @param n the  Index  in the fibonacci sequence
     * @return the nth number in the fibonacci sequence
     * Time complexity of the algorithm is O(2^n)
     * The Fibonacci function computes the nth Fibonacci number recursively.
     * For the first two Fibonacci numbers, 1 is returned when n is 1 or 2 because the first two Fibonacci numbers are both 1.
     * For any other value of n, the function recursively calculates the Fibonacci number by summing the previous two Fibonacci numbers.
     * The main method calls the Fibonacci function with n = 17 (or any other value specified) and prints the result.
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * The function solves the problem
     * The function calculates the nth number in the fibonacci sequence
     * The function then prints the result
     */
    public static void solve() {
        int n = 17;
        int solution = fibonacci(n);
        System.out.println(solution);
    }
}
