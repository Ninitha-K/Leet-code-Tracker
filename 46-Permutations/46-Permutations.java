// Last updated: 25/09/2026, 09:53:53
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        boolean[] used = new boolean[nums.length];
5
6        backtrack(nums, used, new ArrayList<>(), result);
7
8        return result;
9    }
10
11    private void backtrack(int[] nums, boolean[] used,
12                            List<Integer> current,
13                            List<List<Integer>> result) {
14
15        // Base case: permutation is complete
16        if (current.size() == nums.length) {
17            result.add(new ArrayList<>(current));
18            return;
19        }
20
21        // Try every number
22        for (int i = 0; i < nums.length; i++) {
23
24            // Already used in current permutation
25            if (used[i]) {
26                continue;
27            }
28
29            // Choose
30            current.add(nums[i]);
31            used[i] = true;
32
33            // Explore
34            backtrack(nums, used, current, result);
35
36            // Undo / Backtrack
37            current.remove(current.size() - 1);
38            used[i] = false;
39        }
40    }
41}