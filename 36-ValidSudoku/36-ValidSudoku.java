// Last updated: 25/09/2026, 09:28:10
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3        HashSet<Character>[] rows = new HashSet[9];
4        HashSet<Character>[] cols = new HashSet[9];
5        HashSet<Character>[] boxes = new HashSet[9];
6
7        for (int i = 0; i < 9; i++) {
8            rows[i] = new HashSet<>();
9            cols[i] = new HashSet<>();
10            boxes[i] = new HashSet<>();
11        }
12
13        for (int r = 0; r < 9; r++) {
14            for (int c = 0; c < 9; c++) {
15                if (board[r][c] == '.') {
16                    continue;
17                }
18
19                char value = board[r][c];
20                int boxIndex = (r / 3) * 3 + (c / 3);
21
22                if (rows[r].contains(value) || cols[c].contains(value) || boxes[boxIndex].contains(value)) {
23                    return false;
24                }
25
26                rows[r].add(value);
27                cols[c].add(value);
28                boxes[boxIndex].add(value);
29            }
30        }
31
32        return true;        
33    }
34}