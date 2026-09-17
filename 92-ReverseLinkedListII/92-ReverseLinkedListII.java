// Last updated: 17/09/2026, 09:53:29
1class Solution {
2    public ListNode reverseBetween(ListNode head, int m, int n) {
3        if (head == null)
4            return null;
5        ListNode dummy = new ListNode(0);
6        dummy.next = head;
7        ListNode pre = dummy;
8        for (int i = 0; i < m - 1; i++) {
9            pre = pre.next;
10        }
11        ListNode start = pre.next;
12        ListNode then = start.next;
13        for (int i = 0; i < n - m; i++) {
14            start.next = then.next;
15            then.next = pre.next;
16            pre.next = then;
17            then = start.next;
18        }
19        return dummy.next;
20    }
21}