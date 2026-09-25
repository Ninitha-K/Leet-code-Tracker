// Last updated: 25/09/2026, 09:57:30
1class Solution {
2    public void setZeroes(int[][] matrix) {
3
4        int m = matrix.length;
5        int n = matrix[0].length;
6
7        boolean firstRowZero = false;
8        boolean firstColZero = false;
9
10        // 1. Check whether first row contains 0
11        for (int j = 0; j < n; j++) {
12            if (matrix[0][j] == 0) {
13                firstRowZero = true;
14            }
15        }
16
17        // 2. Check whether first column contains 0
18        for (int i = 0; i < m; i++) {
19            if (matrix[i][0] == 0) {
20                firstColZero = true;
21            }
22        }
23
24        // 3. Use first row and first column as markers
25        for (int i = 1; i < m; i++) {
26            for (int j = 1; j < n; j++) {
27
28                if (matrix[i][j] == 0) {
29                    matrix[i][0] = 0;
30                    matrix[0][j] = 0;
31                }
32            }
33        }
34
35        // 4. Set marked rows to 0
36        for (int i = 1; i < m; i++) {
37            if (matrix[i][0] == 0) {
38
39                for (int j = 1; j < n; j++) {
40                    matrix[i][j] = 0;
41                }
42            }
43        }
44
45        // 5. Set marked columns to 0
46        for (int j = 1; j < n; j++) {
47            if (matrix[0][j] == 0) {
48
49                for (int i = 1; i < m; i++) {
50                    matrix[i][j] = 0;
51                }
52            }
53        }
54
55        // 6. Finally handle first row
56        if (firstRowZero) {
57            for (int j = 0; j < n; j++) {
58                matrix[0][j] = 0;
59            }
60        }
61
62        // 7. Finally handle first column
63        if (firstColZero) {
64            for (int i = 0; i < m; i++) {
65                matrix[i][0] = 0;
66            }
67        }
68    }
69}