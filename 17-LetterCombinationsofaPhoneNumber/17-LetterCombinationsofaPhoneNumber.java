// Last updated: 25/09/2026, 09:18:30
1class Solution {
2    private Map<Character, String> digitToLetters = new HashMap<>();
3    private List<String> resultList = new ArrayList<>();
4
5    public List<String> letterCombinations(String digits) {
6        if (digits == null || digits.length() == 0) {
7            return resultList;
8        }
9
10        digitToLetters.put('2', "abc");
11        digitToLetters.put('3', "def");
12        digitToLetters.put('4', "ghi");
13        digitToLetters.put('5', "jkl");
14        digitToLetters.put('6', "mno");
15        digitToLetters.put('7', "pqrs");
16        digitToLetters.put('8', "tuv");
17        digitToLetters.put('9', "wxyz");
18
19        generateCombinations(digits, 0, new StringBuilder());
20
21        return resultList;
22
23
24    }
25
26
27    private void generateCombinations(String digits, int currentIndex, StringBuilder currentCombination) {
28        if (currentIndex == digits.length()) {
29            resultList.add(currentCombination.toString());
30            return;
31        }
32
33        char currentDigit = digits.charAt(currentIndex);
34        String letterOptions = digitToLetters.get(currentDigit);
35
36        if (letterOptions != null) {
37            for (int i = 0; i < letterOptions.length(); i++) {
38                char letter = letterOptions.charAt(i);
39                currentCombination.append(letter);
40                generateCombinations(digits, currentIndex + 1, currentCombination);
41                currentCombination.deleteCharAt(currentCombination.length() - 1);
42            }
43        }
44    }
45}