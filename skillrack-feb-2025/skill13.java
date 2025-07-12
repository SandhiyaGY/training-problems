import java.util.Scanner;
public class skill13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int len1 = str1.length() + 1;
        int len2 = str2.length() + 1;
        int[][] dp = new int[len1][len2];
        int max = 0;
        int endIndex = 0;
        for (int i = 1; i < len1; i++) {
            for (int j = 1; j < len2; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > max) {
                        max = dp[i][j];
                        endIndex = i; 
                    }
                }
            }
        }
        System.out.println(str1.substring(endIndex - max, endIndex));
        sc.close();
    }
}

