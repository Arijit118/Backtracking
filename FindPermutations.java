package Backtracking;

public class FindPermutations {

    public static void findPermutations(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i + 1);
            findPermutations(Newstr, ans + curr);
        }
    }

    public static void main(String args[]) {
        // Find and print all permutations of a string.
        // ex. "abc" -> abc, acb, bac, bca, cab, cba.
        // If string length n, then total permutations = n!.
        // Time complexity = O(n*n!). space complexity = O(n).
        String str = "abc";
        findPermutations(str, "");
    }
}
