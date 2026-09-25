// Last updated: 25/09/2026, 09:25:08
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
11class Solution {
12    public ListNode reverseList(ListNode tail, ListNode head, int k) {
13        ListNode original = head;
14        ListNode prev = null;
15        ListNode curr = head;
16        ListNode next = head;
17
18        while (k != 0) {
19            next = curr.next;
20            curr.next = prev;
21            prev = curr;
22            curr = next;
23            k--;
24        }
25
26        head.next = next;
27        head = prev;
28
29        if (tail != null) {
30            tail.next = head;
31        }
32
33        return original;
34    }
35
36    public ListNode reverseKGroup(ListNode head, int k) {
37        int n = 0;
38        ListNode curr = head;
39
40        while (curr != null) {
41            curr = curr.next;
42            n++;
43        }
44
45        if (k == 1 || n == 1) {
46            return head;
47        }
48
49        int count = 1;
50        ListNode ans = head;
51
52        while (count != k) {
53            ans = ans.next;
54            count++;
55        }
56
57        ListNode tail = reverseList(null, head, k);
58        n = n - k;
59
60        while (n >= k) {
61            tail = reverseList(tail, tail.next, k);
62            n = n - k;
63        }
64
65        return ans;
66    }
67}