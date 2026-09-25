// Last updated: 25/09/2026, 09:20:12
1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3        List<List<Integer>> li=new ArrayList<>();
4        if(nums==null || nums.length<4){
5            return li;
6        }
7        Arrays.sort(nums);
8        for(int i=0;i<nums.length-3;i++){
9            if(i>0&&nums[i]==nums[i-1]){
10                continue;
11            }
12            for(int j=i+1;j<nums.length-2;j++){
13                if(j>i+1&&nums[j]==nums[j-1]){
14                    continue;
15                }
16                int left=j+1; int right=nums.length-1;
17                while(left<right){
18                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
19                    if(sum==target){
20                        li.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
21                        while(left<right&&nums[left]==nums[left+1]){
22                            left++;
23                        }
24                        while(left<right&&nums[right]==nums[right+-1]){
25                            right--;
26                        }
27                        left++;
28                        right--;
29                    }else if(sum<target){
30                        left++;
31                    }else{
32                        right--;
33                    }
34                }
35            }
36        }
37        return li;
38    }
39}