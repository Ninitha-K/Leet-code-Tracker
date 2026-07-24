// Last updated: 24/07/2026, 09:52:37
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int maxSum = Integer.MIN_VALUE;
4        int currentSum = 0;
5        
6        for (int i = 0; i < nums.length; i++) {
7            currentSum += nums[i];
8            
9            if (currentSum > maxSum) {
10                maxSum = currentSum;
11            }
12            
13            if (currentSum < 0) {
14                currentSum = 0;
15            }
16        }
17        
18        return maxSum;
19    }
20}