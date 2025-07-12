//LEETCODE:5
class Solution {
    public String longestPalindrome(String s) {
        int N = s.length();
        if (N < 2) return s;

        boolean[][] dp = new boolean[N][N];
        int maxLen = 1;
        int start = 0;
        // All substrings of length 1 are palindromes
        for (int i = 0; i < N; i++) {
            dp[i][i] = true;
        }
        // Check substrings of length 2
        for (int i = 0; i < N - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLen = 2;
            }
        }
        // Check substrings of length 3 and more
        for (int len = 3; len <= N; len++) {
            for (int i = 0; i <= N - len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    start = i;
                    maxLen = len;
                }
            }
        }

        return s.substring(start, start + maxLen);
    }
}
