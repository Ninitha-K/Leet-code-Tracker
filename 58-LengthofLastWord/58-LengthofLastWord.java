// Last updated: 28/07/2026, 21:22:16
1class Solution {
2    public int lengthOfLastWord(String s) {
3       s=s.trim();
4       int len=0;
5       for(int i=s.length()-1;i>=0;i--)
6       {
7        if(s.charAt(i)!= ' ')
8        {
9            len++;
10        }
11        else if(len>0)
12        {
13            break;
14        }
15       }
16       return len;
17    }
18}