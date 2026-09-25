// Last updated: 25/09/2026, 10:01:59
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
16public class BSTIterator {
17    private Stack<TreeNode> stack = new Stack<TreeNode>();
18    
19    public BSTIterator(TreeNode root) {
20        pushAll(root);
21    }
22
23    /** @return whether we have a next smallest number */
24    public boolean hasNext() {
25        return !stack.isEmpty();
26    }
27
28    /** @return the next smallest number */
29    public int next() {
30        TreeNode tmpNode = stack.pop();
31        pushAll(tmpNode.right);
32        return tmpNode.val;
33    }
34    
35    private void pushAll(TreeNode node) {
36        for (; node != null; stack.push(node), node = node.left);
37    }
38}
39/**
40 * Your BSTIterator object will be instantiated and called as such:
41 * BSTIterator obj = new BSTIterator(root);
42 * int param_1 = obj.next();
43 * boolean param_2 = obj.hasNext();
44 */