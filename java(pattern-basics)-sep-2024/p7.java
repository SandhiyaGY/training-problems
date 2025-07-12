/*
 input:n=4
 output:
 1 1 1 1
 1     1
 1     1
 1 1 1 1

 */
import java.util.*;
class p7
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1||j==1||i==n||j==n)
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