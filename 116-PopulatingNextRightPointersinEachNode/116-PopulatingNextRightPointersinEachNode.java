// Last updated: 04/08/2026, 09:41:36
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node left;
6    public Node right;
7    public Node next;
8
9    public Node() {}
10    
11    public Node(int _val) {
12        val = _val;
13    }
14
15    public Node(int _val, Node _left, Node _right, Node _next) {
16        val = _val;
17        left = _left;
18        right = _right;
19        next = _next;
20    }
21};
22*/
23import java.util.*;
24class Solution 
25{
26    public Node connect(Node root) 
27    {
28        Queue<Node> queue=new LinkedList<>();
29        if(root==null)
30          return root;
31        queue.offer(root);
32        while(!queue.isEmpty())
33        {
34            int n=queue.size();
35            for(int i=0;i<n;i++)
36            {
37                Node current=queue.poll();
38                if(current.left!=null)
39                  queue.offer(current.left);
40                if(current.right!=null)
41                 queue.offer(current.right);
42                if(i==n-1)
43                  current.next=null;
44                else
45                  current.next=queue.peek();
46            }
47        }
48        return root;
49    }
50}