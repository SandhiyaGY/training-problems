/*
input:n=4
output:
* * * * * * *
  * * * * *
    * * *
      *



*/

import java.util.*;
class p14{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
       for(int i=1;i<=n;i++){
           for(int j=2;j<=i;j++)
           {
               System.out.print("  ");
           }
          for(int k=1;k<=n-i;k++)
          {
              System.out.print("* ");
          }
          for(int m=n;m>=i;m--)
          {
              System.out.print("* ");
          }
         System.out.println("");
        
        }
    }
}


// other method
// int c=2*n-1;
// for(int i=1;i<=n;i++)
// {
//     for(int j=0;j<i;j++)
//     {
//         System.out.print("  ");
//     }
//     for(int k=1;k<=c;k++)
//     {
//         System.out.print("* ");
//     }
//     c-=2;
//     System.out.println();
// }
