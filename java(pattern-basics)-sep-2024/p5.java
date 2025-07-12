/*
 input:n=4
 output:
 1 0 1 0
 1 0 1 0
 1 0 1 0
 1 0 1 0

 */
import java.util.*;
class p5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(j%2+" ");
            }
            System.out.println();
        }

    }
}