// Last updated: 04/08/2026, 09:36:23
1class Solution {
2    public boolean canFinish(int n, int[][] prerequisites) {
3        List<Integer>[] adj = new List[n];
4        int[] indegree = new int[n];
5        List<Integer> ans = new ArrayList<>();
6
7        for (int[] pair : prerequisites) {
8            int course = pair[0];
9            int prerequisite = pair[1];
10            if (adj[prerequisite] == null) {
11                adj[prerequisite] = new ArrayList<>();
12            }
13            adj[prerequisite].add(course);
14            indegree[course]++;
15        }
16
17        Queue<Integer> queue = new LinkedList<>();
18        for (int i = 0; i < n; i++) {
19            if (indegree[i] == 0) {
20                queue.offer(i);
21            }
22        }
23
24        while (!queue.isEmpty()) {
25            int current = queue.poll();
26            ans.add(current);
27
28            if (adj[current] != null) {
29                for (int next : adj[current]) {
30                    indegree[next]--;
31                    if (indegree[next] == 0) {
32                        queue.offer(next);
33                    }
34                }
35            }
36        }
37
38        return ans.size() == n;
39    }
40}