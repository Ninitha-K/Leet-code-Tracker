// Last updated: 31/07/2026, 10:07:22
1class Solution {
2	 public static void reverse(int nums[], int i, int j){
3        int li = i;
4        int ri = j;
5        
6        while(li < ri){
7            int temp = nums[li];
8            nums[li] = nums[ri];
9            nums[ri] = temp;
10            
11            li++;
12            ri--;
13        }
14    }
15    public void rotate(int[] nums, int k) {
16        k = k % nums.length; 
17        if(k < 0){ 
18            k += nums.length;
19        }
20        reverse(nums, 0, nums.length - k - 1);
21        reverse(nums, nums.length - k, nums.length - 1);
22        reverse(nums, 0, nums.length - 1);
23    }
24}