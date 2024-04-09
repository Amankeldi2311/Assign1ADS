package problems;

public class ProblemTen {
    /**
     * @param a first number
     * @param b second number
     * @return the greatest common divisor of a and b
     * The function calculates the greatest common divisor of two numbers using the Euclidean algorithm.
     * The algorithm repeatedly divides the larger number by the smaller number and replaces the larger number with the remainder.
     * This process is repeated until the remainder is 0, at which point the smaller number is the greatest common divisor.
     * The function is implemented recursively, with the base case being when the second number is 0.
     * In this case, the first number is returned as the greatest common divisor.
     * The main method calls the gcd function with a = 32 and b = 48 (or any other values specified) and prints the result.
     * The time complexity of the algorithm is O(log(min(a, b))), where a and b are the input numbers.
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void solve() {
        int a = 32;
        int b = 48;
        int solution = gcd(a, b);
        System.out.println(solution);
    }
}
