/*
 input:n=4
 output:
      * 
    * * * 
  * * * * * 
* * * * * * * 


 */
import java.util.*;
class p15{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
       for(int i=1;i<=n;i++){
           for(int j=n;j>=i;j--)
           {
               System.out.print("  "); 
           }
           for(int k=1;k<=i;k++)
           {
               System.out.print("* ");
           }
           for(int j=2;j<=i;j++)
           {
               System.out.print("* ");
           }
           System.out.println("");
       }

    }
}

// other method
// int c=1;
// for(int i=1;i<=n;i++)
// {
//     for(int j=n;j>i;j--)
//     {
//         System.out.print("  ");
//     }
//     for(int k=1;k<=c;k++)
//     {
//         System.out.print("* ");
//     }
//     c+=2;
//     System.out.println();
// }

