// Last updated: 18/07/2026, 09:22:43
1class Solution {
2    // Helper function to check if placing a queen at position (row,col) is safe
3    private boolean isSafePlace(int n, char[][] nQueens, int row, int col) {
4        // Check if there's any queen in the same column above current position
5        for (int i = 0; i < n; i++) {
6            if (nQueens[i][col] == 'Q') {
7                return false;
8            }
9        }
10
11        // Check upper-left diagonal for any queen
12        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
13            if (nQueens[i][j] == 'Q') {
14                return false;
15            }
16        }
17
18        // Check upper-right diagonal for any queen
19        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
20            if (nQueens[i][j] == 'Q') {
21                return false;
22            }
23        }
24
25        // If no conflicts found, position is safe
26        return true;
27    }
28
29    // Recursive helper function to solve N-Queens problem
30    private void solveNQueens(int n, List<List<String>> output, char[][] nQueens, int row) {
31        // Base case: if we've placed queens in all rows, we found a valid solution
32        if (row == n) {
33            List<String> solution = new ArrayList<>();
34            for (char[] rowArray : nQueens) {
35                solution.add(new String(rowArray));
36            }
37            output.add(solution);
38            return;
39        }
40
41        // Try placing queen in each column of current row
42        for (int col = 0; col < n; col++) {
43            // If current position is safe
44            if (isSafePlace(n, nQueens, row, col)) {
45                // Place queen
46                nQueens[row][col] = 'Q';
47                // Recursively solve for next row
48                solveNQueens(n, output, nQueens, row + 1);
49                // Backtrack: remove queen for trying next position
50                nQueens[row][col] = '.';
51            }
52        }
53    }
54
55    // Main function to solve N-Queens problem
56    public List<List<String>> solveNQueens(int n) {
57        List<List<String>> output = new ArrayList<>();  // Stores all valid solutions
58        char[][] nQueens = new char[n][n];  // Initialize empty board
59        
60        // Fill the board with dots
61        for (int i = 0; i < n; i++) {
62            Arrays.fill(nQueens[i], '.');
63        }
64        
65        solveNQueens(n, output, nQueens, 0); // Start solving from row 0
66        return output;
67    }
68}