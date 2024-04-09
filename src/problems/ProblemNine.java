package problems;

public class ProblemNine {
    /**
     * @param n number of elements in the array
     * @param k number of elements to choose from the array
     * @return binomial coefficient of n and k
     * The function calculates the binomial coefficient of n and k using recursion.
     * The binomial coefficient is calculated using the formula C(n, k) = C(n - 1, k - 1) + C(n - 1, k).
     * The base cases are when k is 0 or k is equal to n, in which case the result is 1.
     * The function recursively calculates the binomial coefficient by summing the binomial coefficients of the previous elements.
     * The main method calls the binomialCoefficient function with n = 2 and k = 1 (or any other values specified) and prints the result.
     * The time complexity of the algorithm is O(2^n).
     */
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    public static void solve() {
        int n = 2;
        int k = 1;
        int solution = binomialCoefficient(n, k);
        System.out.println(solution);
    }
}
