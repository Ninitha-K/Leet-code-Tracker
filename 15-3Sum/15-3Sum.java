// Last updated: 12/10/2026, 07:25:51
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> result=new ArrayList();
4        Arrays.sort(nums);
5        for(int i=0;i<nums.length-2;i++){
6            if(i>0 && nums[i]==nums[i-1]){
7                continue;
8            }
9
10            int left=i+1;
11            int right=nums.length-1;
12
13            while(left<right)
14            {
15                int sum=nums[i]+nums[left]+nums[right];
16                if(sum==0){
17                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
18
19                    left++;
20                    right--;
21
22                    while(left<right && nums[left]==nums[left-1]){
23                        left++;
24                    }
25
26                    while(left<right && nums[right]==nums[right+1]){
27                        right--;
28                    }
29                }
30                else if(sum<0){
31                    left++;
32                }
33                else{
34                    right--;
35                }
36            }
37        }
38        return result;
39    }
40}