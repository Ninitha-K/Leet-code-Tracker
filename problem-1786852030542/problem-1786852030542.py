# Last updated: 16/08/2026, 09:17:10
1class Solution(object):
2    def nearestDrone(self, drones, target):
3        """
4        :type drones: List[List[int]]
5        :type target: List[int]
6        :rtype: int
7        """
8        tx,ty=target
9        best_index=-1
10        best_distance=float('inf')
11        for i,(x,y,r) in enumerate(drones):
12            dist=abs(x-tx)+abs(y-ty)
13            if dist<=r:
14                if dist<best_distance or (dist==best_distance and i<best_index):
15                    best_distance=dist
16                    best_index=i
17        return best_index
18            
19        