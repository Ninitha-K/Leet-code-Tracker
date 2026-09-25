// Last updated: 25/09/2026, 09:19:27
1import java.util.Arrays;
2
3class Solution {
4    public int threeSumClosest(int[] nums, int target) {
5        Arrays.sort(nums);
6        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize closest sum with the sum of the first three elements
7
8        for (int i = 0; i < nums.length - 2; i++) {
9            int j = i + 1;
10            int k = nums.length - 1;
11
12            while (j < k) {
13                int sum = nums[i] + nums[j] + nums[k];
14
15                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
16                    closestSum = sum; // Update closest sum if the current sum is closer to the target
17                }
18
19                if (sum < target) {
20                    j++; // Increment j to increase the sum
21                } else {
22                    k--; // Decrement k to decrease the sum
23                }
24            }
25        }
26
27        return closestSum;
28    }
29}