// Last updated: 12/10/2026, 06:24:43
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int left=0;
4        int right=numbers.length-1;
5
6        while(left<right){
7            int result=numbers[left]+numbers[right];
8            if(result==target)
9            {
10                return new int[]{left+1,right+1};
11            }
12            else if(result<target)
13            {
14                left++;
15            }
16            else
17            {
18                right--;
19            }
20        }
21        return new int[]{};
22    }
23}