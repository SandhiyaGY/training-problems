//GFG:Longest Common Substring

//Approach:DP
//Example:s1=abcd,s2=bcda
//   a b c d
// b 0 1 0 0
// c 0 0 2 0
// d 0 0 0 3
// a 1 0 0 0
//Greatest:3 


//This function return the length of the LCS
class Solution {
    public int longestCommonSubstr(String s1, String s2) {
        // code here
        int maxLen=0;
        int LEN1=s1.length();
        int LEN2=s2.length();
        int[][] dp=new int[LEN1+1][LEN2+1];
        for(int row=1;row<LEN1+1;row++){
            for(int col=1;col<LEN2+1;col++){
                if(s1.charAt(row-1)==s2.charAt(col-1)){
                    dp[row][col]=dp[row-1][col-1]+1;
                    if(maxLen<dp[row][col]){
                        maxLen=dp[row][col];
                    }
                }
            }
        }
        return maxLen;
    }
}

//This function prints the LCS
class Solution {
    public int longestCommonSubstr(String s1, String s2) {
        int maxLen = 0;
        int LEN1 = s1.length();
        int LEN2 = s2.length();
        int endi = 0, endj = 0;
        int[][] dp = new int[LEN1 + 1][LEN2 + 1];

        for (int row = 1; row <= LEN1; row++) {
            for (int col = 1; col <= LEN2; col++) {
                if (s1.charAt(row - 1) == s2.charAt(col - 1)) {
                    dp[row][col] = dp[row - 1][col - 1] + 1;
                    if (maxLen < dp[row][col]) {
                        maxLen = dp[row][col];
                        endi = row;
                        endj = col;
                    }
                }
            }
        }

        if (maxLen > 0) {
            //Use either s1 or s2 both works
            int starti = endi - (maxLen - 1);
            int startj = endj - (maxLen - 1);
            System.out.println(s1.substring(starti - 1, endi));
            System.out.println(s2.substring(startj - 1, endj));
        }

        return maxLen;
    }
}

