// Last updated: 31/07/2026, 09:08:06
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
17    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
18        ArrayList<List<Integer>> li = new ArrayList<>();
19        ArrayList<Integer> a = new ArrayList<>();
20        dfs(root,targetSum,0,li,a);
21        return li;
22    }
23    void dfs(TreeNode root, int targetSum,int sum,List<List<Integer>> li,List<Integer> a ){
24        if(root==null){
25            return;
26        }
27        sum +=root.val;
28        a.add(root.val);
29        if(root.left==null&&root.right==null && sum==targetSum){
30            li.add(new ArrayList<>(a));
31        }
32        dfs(root.left,targetSum,sum,li,a);
33        dfs(root.right,targetSum,sum,li,a);
34        a.remove(a.size()-1);
35    }
36}