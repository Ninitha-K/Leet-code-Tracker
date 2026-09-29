// Last updated: 29/09/2026, 09:01:39
1import java.util.*;
2
3class Solution {
4    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
5
6        TreeSet<Long> set = new TreeSet<>();
7
8        for (int i = 0; i < nums.length; i++) {
9
10            // Find smallest value >= nums[i] - valueDiff
11            Long ceil = set.ceiling((long) nums[i] - valueDiff);
12
13            // Check whether it is also <= nums[i] + valueDiff
14            if (ceil != null && ceil <= (long) nums[i] + valueDiff) {
15                return true;
16            }
17
18            set.add((long) nums[i]);
19
20            // Maintain sliding window of size indexDiff
21            if (i >= indexDiff) {
22                set.remove((long) nums[i - indexDiff]);
23            }
24        }
25
26        return false;
27    }
28}