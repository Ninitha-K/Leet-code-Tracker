// Last updated: 25/07/2026, 10:27:21
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
17    public List<List<Integer>> levelOrderBottom(TreeNode root) {
18         List<List<Integer>> ans = new ArrayList<>();
19        if (root == null) return ans;
20        Queue<TreeNode> q = new LinkedList<>();
21        q.add(root);
22        while(q.size()>0){
23            List<Integer>list = new ArrayList<>();
24            int n = q.size();
25            for(int i =0;i<n;i++){
26                TreeNode front = q.remove();
27                list.add(front.val);
28                if(front.left != null) q.add(front.left);
29                if(front.right != null) q.add(front.right);
30            }
31            ans.add(0,list);
32        }
33        return ans;
34    }
35}