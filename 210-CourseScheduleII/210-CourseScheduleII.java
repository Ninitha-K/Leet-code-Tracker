// Last updated: 28/09/2026, 09:21:40
1import java.util.*;
2
3class Solution {
4    public int[] findOrder(int numCourses, int[][] prerequisites) {
5
6        // 1. Build graph
7        List<List<Integer>> graph = new ArrayList<>();
8
9        for (int i = 0; i < numCourses; i++) {
10            graph.add(new ArrayList<>());
11        }
12
13        // 2. Calculate indegree
14        int[] indegree = new int[numCourses];
15
16        for (int[] p : prerequisites) {
17            int course = p[0];
18            int prerequisite = p[1];
19
20            graph.get(prerequisite).add(course);
21            indegree[course]++;
22        }
23
24        // 3. Add courses with indegree 0
25        Queue<Integer> queue = new LinkedList<>();
26
27        for (int i = 0; i < numCourses; i++) {
28            if (indegree[i] == 0) {
29                queue.offer(i);
30            }
31        }
32
33        // 4. BFS / Topological Sort
34        int[] result = new int[numCourses];
35        int index = 0;
36
37        while (!queue.isEmpty()) {
38
39            int current = queue.poll();
40
41            result[index++] = current;
42
43            // Reduce indegree of dependent courses
44            for (int next : graph.get(current)) {
45
46                indegree[next]--;
47
48                if (indegree[next] == 0) {
49                    queue.offer(next);
50                }
51            }
52        }
53
54        // 5. Cycle detection
55        if (index != numCourses) {
56            return new int[0];
57        }
58
59        return result;
60    }
61}