// Last updated: 24/07/2026, 09:53:26
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        List<Integer> res = new ArrayList<>();
4        int top = 0, bottom = matrix.length - 1;
5        int left = 0, right = matrix[0].length - 1;
6
7        while (top <= bottom && left <= right) {
8            // Top row
9            for (int i = left; i <= right; i++) {
10                res.add(matrix[top][i]);
11            }
12            top++;
13
14            // Right column
15            for (int i = top; i <= bottom; i++) {
16                res.add(matrix[i][right]);
17            }
18            right--;
19
20            if (top <= bottom) {
21                // Bottom row
22                for (int i = right; i >= left; i--) {
23                    res.add(matrix[bottom][i]);
24                }
25                bottom--;
26            }
27
28            if (left <= right) {
29                // Left column
30                for (int i = bottom; i >= top; i--) {
31                    res.add(matrix[i][left]);
32                }
33                left++;
34            }
35        }
36        return res;
37    }
38}