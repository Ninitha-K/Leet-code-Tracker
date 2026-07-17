// Last updated: 17/07/2026, 09:15:47
1class Solution {
2    public String RLE(String sequence) {
3        StringBuilder sb = new StringBuilder();
4        char[] nums = sequence.toCharArray();
5        char curr = nums[0];
6        int count = 0;
7        
8        
9        for (char num : nums) {
10            if (num == curr)
11                count++;
12            else {
13                sb.append(count);
14                sb.append(curr);
15                curr = num;
16                count = 1;
17            }
18        }
19        
20        
21        sb.append(count);
22        sb.append(curr);
23        return sb.toString();
24    }
25    
26    
27    public String countAndSay(int n) {
28        if (n == 1)
29            return "1";
30        
31        
32        return RLE(countAndSay(n - 1));
33    }
34}