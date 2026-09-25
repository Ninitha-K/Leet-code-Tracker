// Last updated: 25/09/2026, 10:00:55
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17
18    public List<TreeNode> generateTrees(int n) {
19        return buildTrees(1, n);
20    }
21
22    private List<TreeNode> buildTrees(int start, int end) {
23
24        List<TreeNode> result = new ArrayList<>();
25
26        // No nodes
27        if (start > end) {
28            result.add(null);
29            return result;
30        }
31
32        // Try every number as root
33        for (int i = start; i <= end; i++) {
34
35            // Generate all possible left subtrees
36            List<TreeNode> leftTrees = buildTrees(start, i - 1);
37
38            // Generate all possible right subtrees
39            List<TreeNode> rightTrees = buildTrees(i + 1, end);
40
41            // Combine every left tree with every right tree
42            for (TreeNode left : leftTrees) {
43                for (TreeNode right : rightTrees) {
44
45                    TreeNode root = new TreeNode(i);
46
47                    root.left = left;
48                    root.right = right;
49
50                    result.add(root);
51                }
52            }
53        }
54
55        return result;
56    }
57}