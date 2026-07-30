// Last updated: 30/07/2026, 22:07:08
1class Solution {
2    public int mostWordsFound(String[] sentences)
3    {
4        int maxlen=0;
5        for(String curr:sentences)
6        {
7            int currlen=curr.split(" ").length;
8            if(maxlen<currlen)
9            {
10                maxlen=currlen;
11            }
12        }
13          return maxlen;
14    }
15}