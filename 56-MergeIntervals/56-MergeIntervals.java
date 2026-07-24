// Last updated: 24/07/2026, 09:55:36
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
4
5        List<int[]> merged = new ArrayList<>();
6        int[] prev = intervals[0];
7
8        for (int i = 1; i < intervals.length; i++) {
9            int[] interval = intervals[i];
10            if (interval[0] <= prev[1]) {
11                prev[1] = Math.max(prev[1], interval[1]);
12            } else {
13                merged.add(prev);
14                prev = interval;
15            }
16        }
17
18        merged.add(prev);
19
20        return merged.toArray(new int[merged.size()][]);         
21    }
22}