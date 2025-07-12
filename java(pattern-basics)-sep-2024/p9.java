/*
 input:n=4
 output:
 * * * *
  * * * *
   * * * *
    * * * *

 */
import java.util.*;
class p9
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=2;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}