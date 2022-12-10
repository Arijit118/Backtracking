package Backtracking;

public class GridWays {
    // Time complexity = O(2^(n+m)), very bad time complexity. Exponential time
    // complexity
    public static int gridWays(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) { // last cell condition
            return 1;
        } else if (i == n || j == m) {
            return 0;
        }

        // recursion
        int w1 = gridWays(i + 1, j, n, m);
        int w2 = gridWays(i, j + 1, n, m);

        return w1 + w2;
    }

    public static void main(String args[]) {
        int n = 4, m = 5;
        System.out.println(gridWays(0, 0, n, m));

    }
}
