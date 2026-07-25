// Last updated: 25/07/2026, 10:19:50
1class Solution {
2    public int maximumGap(int[] nums) {
3        
4        if(nums.length < 2) return 0;
5        radixSort(nums);
6
7        int maxGap = 0;
8        for (int i = 1; i < nums.length; i++)
9            maxGap = Math.max(maxGap, nums[i] - nums[i - 1]);
10
11        return maxGap;
12    }
13
14    private void radixSort(int[] nums)
15    {
16        int max = nums[0];
17        for (int num : nums)
18            if (num > max) { max = num; }
19
20        int n = nums.length;
21        int[] output = new int[n];
22
23        for (int exp = 1; max / exp > 0; exp *= 10) 
24        {
25            int[] count = new int[10];
26
27            // Count frequency of each digit
28            for (int num : nums) 
29            {
30                int digit = (num / exp) % 10;
31                count[digit]++;
32            }
33
34            // Prefix sum
35            for (int i = 1; i < 10; i++) { count[i] += count[i - 1]; }
36
37            // Build output array (stable sort btw)
38            for (int i = n - 1; i >= 0; i--) 
39            {
40                // Aa har 1-1 digit according sort kare
41                // Etle stable bane
42                int digit = (nums[i] / exp) % 10;
43
44                // AA digit ni current last position...
45                count[digit] = count[digit] - 1;
46
47                // & have e position par element muko
48                int position = count[digit];
49
50                output[position] = nums[i];
51                // output[--count[digit]] = nums[i];
52            }
53
54            // Copy back in our og array nums
55            for (int i = 0; i < n; i++) { nums[i] = output[i]; }
56        }
57    }
58}