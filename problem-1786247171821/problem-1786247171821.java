// Last updated: 09/08/2026, 09:16:11
1class Solution {
2    public double minPrice(int[] prices, int[] discounts) {
3        Arrays.sort(prices);
4        Arrays.sort(discounts);
5        int i=prices.length-1;
6        int j=discounts.length-1;
7        double total=0.0;
8        while(i>=0 && j>=0)
9            {
10                total +=(double)prices[i]*(100-discounts[j])/100.0;
11                i--;
12                j--;
13            }
14        while(i>=0){
15            total+=prices[i];
16            i--;
17        }
18        return total;
19    }
20}