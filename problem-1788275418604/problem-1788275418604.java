// Last updated: 01/09/2026, 20:40:18
1class Solution {
2    public int numIslands(char[][] grid) {
3        Queue<int[]> q = new LinkedList<>();
4
5        if(grid == null || grid.length == 0)
6            return 0;
7
8        int isIsland = 0;
9
10        int m = grid.length;
11        int n = grid[0].length;
12
13        int[][] directions = {
14            {1,0},
15            {-1,0},
16            {0,1},
17            {0,-1}
18        };
19
20        for(int i=0;i<m;i++){
21
22            for(int j=0;j<n;j++){
23
24                if(grid[i][j]=='1'){
25
26                    isIsland++;
27
28                    q.offer(new int[]{i,j});
29
30                    while(!q.isEmpty()){
31
32                        int[] curr = q.poll();
33
34                        int x = curr[0];
35                        int y = curr[1];
36
37                        if(x<0 || x>=m || y<0 || y>=n || grid[x][y]!='1'){
38                            continue;
39                        }
40
41                        grid[x][y]='0';
42
43                        for(int[] dir:directions){
44
45                            int nx=x+dir[0];
46                            int ny=y+dir[1];
47
48                            if(nx>=0 && nx<m && ny>=0 && ny<n && grid[nx][ny]=='1'){
49                                q.offer(new int[]{nx,ny});
50                            }
51                        }
52                    }
53                }
54            }
55        }
56
57        return isIsland;
58    }
59}