package Backtracking;

public class FindSubsets {
    public static void findSubsets(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // recursion
        // for yes choice
        findSubsets(str, ans + str.charAt(i), i + 1);

        // for no choice
        findSubsets(str, ans, i + 1);

    }

    public static void main(String args[]) {
        // find & print all subsets of a given string
        // ex: "abc" -> a, b, c, ab, bc, ac, abc, " "(null subset(ϕ)), here n=3,
        // totSubsets = 2^3 = 8
        // if string length n, then total subsets will be 2^n.
        // Time complexity = O(n*2^n), Space complexity = O(n).
        String str = "abc";
        findSubsets(str, "", 0);
    }
}
