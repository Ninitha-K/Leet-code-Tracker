// Last updated: 12/10/2026, 14:37:31
1class Solution {
2    public void sortColors(int[] nums) {
3        int low=0;
4        int mid=0;
5        int high=nums.length-1;
6
7        while(mid<=high){
8            if(nums[mid]==0)
9            {
10                int temp=nums[low];
11                nums[low]=nums[mid];
12                nums[mid]=temp;
13
14                low++;
15                mid++;
16            }
17            else if(nums[mid]==1)
18            {
19                mid++;
20            }
21            else
22            {
23                int temp=nums[mid];
24                nums[mid]=nums[high];
25                nums[high]=temp;
26
27                high--;
28            }
29        }
30    }
31}