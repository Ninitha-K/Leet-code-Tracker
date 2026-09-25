// Last updated: 25/09/2026, 10:08:28
1import java.util.*;
2
3class Solution {
4
5    class TrieNode {
6        TrieNode[] children = new TrieNode[26];
7        String word;
8    }
9
10    private TrieNode root = new TrieNode();
11    private List<String> result = new ArrayList<>();
12
13    public List<String> findWords(char[][] board, String[] words) {
14
15        // 1. Build Trie
16        for (String word : words) {
17            insert(word);
18        }
19
20        // 2. Start DFS from every cell
21        for (int i = 0; i < board.length; i++) {
22            for (int j = 0; j < board[0].length; j++) {
23                dfs(board, i, j, root);
24            }
25        }
26
27        return result;
28    }
29
30    private void insert(String word) {
31
32        TrieNode node = root;
33
34        for (char c : word.toCharArray()) {
35
36            int index = c - 'a';
37
38            if (node.children[index] == null) {
39                node.children[index] = new TrieNode();
40            }
41
42            node = node.children[index];
43        }
44
45        node.word = word;
46    }
47
48    private void dfs(char[][] board, int row, int col, TrieNode node) {
49
50        // Out of bounds
51        if (row < 0 || row >= board.length ||
52            col < 0 || col >= board[0].length) {
53            return;
54        }
55
56        char c = board[row][col];
57
58        // Already visited
59        if (c == '#') {
60            return;
61        }
62
63        // Character doesn't exist in Trie
64        TrieNode next = node.children[c - 'a'];
65
66        if (next == null) {
67            return;
68        }
69
70        // Word found
71        if (next.word != null) {
72            result.add(next.word);
73
74            // Avoid adding same word again
75            next.word = null;
76        }
77
78        // Mark current cell as visited
79        board[row][col] = '#';
80
81        // Up
82        dfs(board, row - 1, col, next);
83
84        // Down
85        dfs(board, row + 1, col, next);
86
87        // Left
88        dfs(board, row, col - 1, next);
89
90        // Right
91        dfs(board, row, col + 1, next);
92
93        // Backtrack
94        board[row][col] = c;
95    }
96}