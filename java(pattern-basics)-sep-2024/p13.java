/*
 input:n=5
 output:
 *       *
 * *     *
 *   *   *
 *     * *
 * * * * * 

 */
import java.util.*;
class p13
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j==1||i==j||i==n||j==n)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}