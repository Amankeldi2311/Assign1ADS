package problems;

import java.util.Scanner;

public class ProblemFirst {
    /**
     * @param n    number of elements in the array
     * @param array array of integers
     * After looping through the array, the minimum value is stored in the variable min
     *
     * @return minimum value in the array
     */
    public static int findMinimumValue(int n, int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int solution = findMinimumValue(n, array);
        System.out.println(solution);
    }
}