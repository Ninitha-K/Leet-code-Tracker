// Last updated: 30/07/2026, 22:07:28
1class Solution {
2    public int[] runningSum(int[] nums) {
3        int len=nums.length;
4        int i=1;
5        while(i<len)
6        {
7            nums[i]+=nums[i-1];
8            i++;
9        }
10        return nums;
11    }
12}