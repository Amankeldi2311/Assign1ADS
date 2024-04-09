package problems;

import java.util.Scanner;

public class ProblemSecond {
    /**
     * This function calculates the average value of the array
     * by summing all the elements and dividing by the number of elements
     *  Time complexity of the algorithm is O(n)
     *
     * @param n   number of elements in the array
     * @param array array of doubles
     * @return average value of the array
     */
    public static double findAverageValue(int n, double[] array) {
        double sum = 0;
        for (double i : array)
            sum += i;

        return sum / n;
    }

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
        }

        double solution = findAverageValue(n, array);
        System.out.println(solution);
    }
}
