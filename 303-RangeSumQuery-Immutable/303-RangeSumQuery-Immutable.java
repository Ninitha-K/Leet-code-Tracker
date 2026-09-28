// Last updated: 28/09/2026, 09:29:54
1class NumArray {
2    int prefix[];
3    public NumArray(int[] nums) {
4        int n = nums.length;
5        prefix=new int[nums.length];
6        prefix[0] = nums[0];
7        for(int i=1;i<n;i++){
8            prefix[i] = prefix[i-1]+nums[i];
9        }       
10    }
11    
12    public int sumRange(int left, int right) {
13        if(left==0)
14            return prefix[right];
15        return prefix[right] - prefix[left-1];
16    }
17}
18
19/**
20 * Your NumArray object will be instantiated and called as such:
21 * NumArray obj = new NumArray(nums);
22 * int param_1 = obj.sumRange(left,right);
23 */
24
25/**
26 * Your NumArray object will be instantiated and called as such:
27 * NumArray obj = new NumArray(nums);
28 * int param_1 = obj.sumRange(left,right);
29 */