// Last updated: 30/07/2026, 22:09:28
1class Solution {
2    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
3        int left = 0, sum = 0, max = 0;
4
5        for (int right = 0; right < fruits.length; right++) {
6            sum += fruits[right][1];
7
8            while (left <= right && minSteps(fruits[left][0], fruits[right][0], startPos) > k) {
9                sum -= fruits[left][1];
10                left++;
11            }
12
13            max = Math.max(max, sum);
14        }
15
16        return max;
17    }
18
19    private int minSteps(int left, int right, int start) {
20        // Two paths: left first or right first
21        int goLeft = Math.abs(start - left) + (right - left);
22        int goRight = Math.abs(start - right) + (right - left);
23        return Math.min(goLeft, goRight);
24    }
25}
26
27