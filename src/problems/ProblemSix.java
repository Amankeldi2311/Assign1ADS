package problems;

public class ProblemSix {
    /**
     * @param a base number to be raised to the power of n
     * @param n power to raise the base number to
     * @return a raised to the power of n
     * The function recursively computes the power of "a" by multiplying "a" with the result of power(a, n - 1) (i.e., "a" raised to the power of "n - 1").
     * This recursive process continues until the exponent reaches 0, triggering the base case, and causing the recursion to stop.
     */
    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }

    public static void solve() {
        int a = 2;
        int n = 10;
        int solution = power(a, n);
        System.out.println(solution);
    }
}
