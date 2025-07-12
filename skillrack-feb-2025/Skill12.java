import java.util.*;
public class Skill12
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int len1=str1.length()+1;
        int len2=str2.length()+1;
        int[][] dp=new int[len1+1][len2+1];
        int max=0;
        for(int i=1;i<len1;i++)
        {
            for(int j=1;j<len2;j++)
            {
                if(str1.charAt(i-1)==str2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                    max=Math.max(max,dp[i][j]);
                }
            }
        }
        System.out.print(max);
        sc.close();
    }
}