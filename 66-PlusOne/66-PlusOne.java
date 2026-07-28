// Last updated: 28/07/2026, 21:22:32
1class Solution {
2    public int[] plusOne(int[] digits) {
3        for(int i=digits.length-1;i>=0;i--)
4        {
5            if(digits[i] != 9)
6            {
7                digits[i]=digits[i]+1;
8                return digits;
9            }
10            digits[i]=0;
11        }
12        digits = new int[digits.length+1];
13        digits[0]=1;
14        return digits;
15    }
16}