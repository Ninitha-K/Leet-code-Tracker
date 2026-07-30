// Last updated: 30/07/2026, 22:06:44
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int arr[]=new int[n*2];
4        for(int i=0;i<n;i++)
5        {
6            arr[2*i]=nums[i];
7            arr[2*i+1]=nums[n+i];
8        }
9        return arr;
10    }
11}