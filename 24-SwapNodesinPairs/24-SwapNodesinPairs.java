// Last updated: 17/07/2026, 09:11:18
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
12 * Definition for singly-linked list.
13 * public class ListNode {
14 *     int val;
15 *     ListNode next;
16 *     ListNode() {}
17 *     ListNode(int val) { this.val = val; }
18 *     ListNode(int val, ListNode next) {
19 *         this.val = val;
20 *         this.next = next;
21 *     }
22 * }
23 */
24
25class Solution {
26    public ListNode swapPairs(ListNode head) {
27
28        ListNode dummy = new ListNode(0);
29        dummy.next = head;
30
31        ListNode prev = dummy;
32
33        while (prev.next != null && prev.next.next != null) {
34
35            ListNode first = prev.next;
36            ListNode second = first.next;
37
38            first.next = second.next;
39            second.next = first;
40            prev.next = second;
41
42            prev = first;
43        }
44
45        return dummy.next;
46    }
47}