// Last updated: 24/07/2026, 09:56:47
1class Solution {
2    public int[][] insert(int[][] intervals, int[] newInterval) {
3       List<int[]> intervalList = new ArrayList<>(Arrays.asList(intervals));
4        intervalList.add(newInterval);
5        Collections.sort(intervalList, (a, b) -> Integer.compare(a[0], b[0]));
6
7        List<int[]> res = new ArrayList<>();
8        int[] current = intervalList.get(0);
9
10        for (int i = 1; i < intervalList.size(); i++) {
11            int[] interval = intervalList.get(i);
12            
13            if (current[1] >= interval[0]) {
14                current[1] = Math.max(current[1], interval[1]);
15            } else {
16                res.add(current);
17                current = interval;
18            }
19        }
20
21        res.add(current);
22        return res.toArray(new int[res.size()][]);
23    }
24}