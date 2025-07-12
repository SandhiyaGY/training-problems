/*
 input:n=4
 output:
 1 1 1 1
 0 0 0 0
 1 1 1 1
 0 0 0 0

 */
import java.util.*;
class p4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(i%2);
            }
            System.out.println();
        }

    }
}

