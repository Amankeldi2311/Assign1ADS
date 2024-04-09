package problems;

import java.util.Scanner;

public class ProblemSeven {
    /**
     * @param scanner Scanner object
     * @param iter  Remaining number of iterations
     *  Time complexity of the algorithm is O(n)
     * The algorithm is linear because it processes the input numbers only once.
     * It saves the current number and then calls itself with a decreased iteration number.
     * This process repeats until the iteration number reaches 0, at which point the algorithm stops receiving numbers
     *  and prints them from last to first.
     */
    private static void solve(Scanner scanner, int iter) {
        if (iter == 0) return;
        int currentNumber = scanner.nextInt();
        solve(scanner, iter - 1);
        System.out.print(currentNumber + " ");
    }

    public static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        scanner.nextLine();
        solve(scanner, n);
    }
}
