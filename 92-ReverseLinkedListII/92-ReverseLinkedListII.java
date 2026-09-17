// Last updated: 17/09/2026, 10:33:44
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11/**
12 * Definition for a binary tree node.
13 * public class TreeNode {
14 *     int val;
15 *     TreeNode left;
16 *     TreeNode right;
17 *     TreeNode() {}
18 *     TreeNode(int val) { this.val = val; }
19 *     TreeNode(int val, TreeNode left, TreeNode right) {
20 *         this.val = val;
21 *         this.left = left;
22 *         this.right = right;
23 *     }
24 * }
25 */
26class Solution {
27    public TreeNode sortedListToBST(ListNode head) {
28        if(head == null) return null;
29        if(head.next == null) return new TreeNode(head.val);
30        ListNode middle = getMiddle(head);
31        TreeNode root = new TreeNode(middle.val);
32        root.right = sortedListToBST(middle.next);
33        middle.next =null;
34        root.left = sortedListToBST(head);
35        return root;
36    }
37    
38    public ListNode getMiddle(ListNode head){
39        ListNode fast = head;
40        ListNode slow = head;
41        ListNode prev = null;
42        while(fast!=null && fast.next!=null){
43            fast = fast.next.next;
44            prev = slow;
45            slow = slow.next;
46            
47        }
48        if(prev!=null)prev.next =null;
49        return slow;
50    }
51}