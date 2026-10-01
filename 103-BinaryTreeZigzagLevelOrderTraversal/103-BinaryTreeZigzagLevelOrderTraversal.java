// Last updated: 01/10/2026, 10:20:26
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
16public class Solution {
17    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
18    {
19        List<List<Integer>> sol = new ArrayList<>();
20        travel(root, sol, 0);
21        return sol;
22    }
23    
24    private void travel(TreeNode curr, List<List<Integer>> sol, int level)
25    {
26        if(curr == null) return;
27        
28        if(sol.size() <= level)
29        {
30            List<Integer> newLevel = new LinkedList<>();
31            sol.add(newLevel);
32        }
33        
34        List<Integer> collection  = sol.get(level);
35        if(level % 2 == 0) collection.add(curr.val);
36        else collection.add(0, curr.val);
37        
38        travel(curr.left, sol, level + 1);
39        travel(curr.right, sol, level + 1);
40    }
41}