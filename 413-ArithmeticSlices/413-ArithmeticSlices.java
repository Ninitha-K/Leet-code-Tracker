// Last updated: 29/09/2026, 09:05:14
1class Solution {
2    public int numberOfArithmeticSlices(int[] nums) {
3
4        if (nums.length < 3) {
5            return 0;
6        }
7
8        int count = 0;
9        int total = 0;
10
11        for (int i = 2; i < nums.length; i++) {
12
13            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
14
15                count++;
16                total += count;
17
18            } else {
19                count = 0;
20            }
21        }
22
23        return total;
24    }
25}