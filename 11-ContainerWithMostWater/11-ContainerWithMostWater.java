// Last updated: 17/07/2026, 09:13:20
1class Solution {
2    public int maxArea(int[] height) {
3        int left = 0;
4        int right = height.length - 1;
5        int maxArea = 0;
6
7        while (left < right) {
8            int currentArea = Math.min(height[left], height[right]) * (right - left);
9            maxArea = Math.max(maxArea, currentArea);
10
11            if (height[left] < height[right]) {
12                left++;
13            } else {
14                right--;
15            }
16        }
17
18        return maxArea;
19    }
20}