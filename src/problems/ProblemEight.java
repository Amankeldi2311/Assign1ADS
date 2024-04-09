package problems;
public class ProblemEight {
    /**
     * @param s string to check if it is a digit
     * @return true if s is a digit, false otherwise
     *  Time complexity of the algorithm is O(n)
     *  The function checks if the first character of the string is a digit
     *  If it is a digit, it calls itself with the substring of the string starting from the second character
     *  If it is not a digit, it returns false
     *  If the string is empty, it returns true
     *  The function is recursive and will call itself n times where n is the length of the string
     *
     */
    public static boolean isDigit(String s) {
        if (s.length() == 0) {
            return true;
        }
        if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
            return isDigit(s.substring(1));
        }
        return false;
    }

    public static void solve() {
        String s = "123456";
        boolean solution = isDigit(s);
        System.out.println(solution ? "Yes" : "No");
    }
}
