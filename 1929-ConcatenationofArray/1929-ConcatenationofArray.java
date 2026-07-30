// Last updated: 30/07/2026, 22:06:15
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int len=nums.length;
4        int[] ans=new int[2*len];
5        for(int i=0;i<len;i++)
6        {
7            ans[i]=nums[i];
8            ans[i+len]=nums[i];
9        }
10        return ans;
11    }
12}