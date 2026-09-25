// Last updated: 25/09/2026, 09:23:23
1class Solution {
2
3    public String convert(String s, int numRows) {
4        if(numRows == 1) return s;
5
6        boolean down = true;
7        StringBuilder[] sbs = new StringBuilder[numRows];
8
9        for(int i = 0; i < numRows; i++){
10            sbs[i] = new StringBuilder();
11        }
12
13        int index = 0, len = s.length(), i = 0;
14        while(index < len){
15            sbs[i].append(s.charAt(index));
16            index++;
17
18            if(down && i < numRows - 1){
19                i++;
20            } else if (down && i == numRows - 1){
21                down = false;
22                i--;
23            } else if (!down && i > 0){
24                i--;
25            } else if (!down && i == 0){
26                down = true;
27                i++;
28            }
29        }
30
31        for(int j = 1; j < numRows; j++){
32            sbs[0].append(sbs[j]);
33        }
34
35        return sbs[0].toString();
36    }
37}