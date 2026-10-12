// Last updated: 12/10/2026, 15:21:19
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int j=0;
4        for(int i=0;i<=nums.length-1;i++)
5        {
6            if(nums[i]!=0)
7            {
8                int temp=nums[i];
9                nums[i]=nums[j];
10                nums[j]=temp;
11
12                j++;
13            }
14        }
15    }
16}