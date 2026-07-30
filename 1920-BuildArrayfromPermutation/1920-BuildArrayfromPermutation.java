// Last updated: 30/07/2026, 22:06:29
1class Solution {
2    public int[] buildArray(int[] nums) {
3        int[] ans = new int[nums.length];
4        for (int i = 0; i < nums.length; i++) {
5            ans[i] = nums[nums[i]];
6            }
7        return ans;
8    }
9}