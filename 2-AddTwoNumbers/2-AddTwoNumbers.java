// Last updated: 25/09/2026, 09:22:07
1class Solution {
2    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
3        ListNode dummyHead = new ListNode(0);
4        ListNode tail = dummyHead;
5        int carry = 0;
6
7        while (l1 != null || l2 != null || carry != 0) {
8            int digit1 = (l1 != null) ? l1.val : 0;
9            int digit2 = (l2 != null) ? l2.val : 0;
10
11            int sum = digit1 + digit2 + carry;
12            int digit = sum % 10;
13            carry = sum / 10;
14
15            ListNode newNode = new ListNode(digit);
16            tail.next = newNode;
17            tail = tail.next;
18
19            l1 = (l1 != null) ? l1.next : null;
20            l2 = (l2 != null) ? l2.next : null;
21        }
22
23        ListNode result = dummyHead.next;
24        dummyHead.next = null;
25        return result;
26    }
27}