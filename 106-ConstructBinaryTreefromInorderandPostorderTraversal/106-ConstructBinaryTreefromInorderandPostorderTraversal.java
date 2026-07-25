// Last updated: 25/07/2026, 10:25:54
1class Solution {
2    int postIndex;
3    Map<Integer, Integer> map;
4
5    public TreeNode buildTree(int[] inorder, int[] postorder) {
6        map = new HashMap<>();
7        
8        // store inorder indices
9        for (int i = 0; i < inorder.length; i++) {
10            map.put(inorder[i], i);
11        }
12
13        postIndex = postorder.length - 1;
14
15        return helper(inorder, postorder, 0, inorder.length - 1);
16    }
17
18    private TreeNode helper(int[] inorder, int[] postorder, int left, int right) {
19        if (left > right) return null;
20
21        // pick root from postorder
22        int rootVal = postorder[postIndex--];
23        TreeNode root = new TreeNode(rootVal);
24
25        // find index in inorder
26        int index = map.get(rootVal);
27
28        // IMPORTANT: build right first
29        root.right = helper(inorder, postorder, index + 1, right);
30        root.left  = helper(inorder, postorder, left, index - 1);
31
32        return root;
33    }
34}