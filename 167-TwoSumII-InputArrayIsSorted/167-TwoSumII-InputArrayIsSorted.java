// Last updated: 30/07/2026, 22:08:33
1class Solution {
2    public int[] twoSum(int[] numbers, int target) 
3    {
4        int n = numbers.length;
5        int L = 0;
6        int R = n-1;
7
8        while(L < R)
9        {
10            
11        int sum = numbers[L] + numbers[R];
12            if(sum == target) 
13            {
14                return new int[]{L+1, R+1};
15            }
16            else if(sum > target) {
17                R--;
18            }
19            else {
20                L++;
21            }
22        }
23        return new int[]{-1, -1};
24    }
25}