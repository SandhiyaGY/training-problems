/* 
 input:n=4
 output:
        * 
      * * * 
    * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 


 */
import java.util.*;
class p16{
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
        for(int i=1;i<=n-1;i++){
           for(int j=0;j<=i;j++)
           {
               System.out.print("  ");
           }
          for(int k=1;k<n-i;k++)
          {
              System.out.print("* ");
          }
          for(int m=n-1;m>=i;m--)
          {
              System.out.print("* ");
          }
         System.out.println("");
        
        }

    }
}








// other method 

// class p16 {
//     public static void main(String[] args) {
//         System.out.println("Try programiz.pro");
//         int n = 4; // Height of the diamond
//         int noSpace, noOfStars;

//         // Upper part of the diamond
//         noSpace = n - 1;
//         noOfStars = 1;
//         for (int i = 1; i <= n; i++) {
//             // Print spaces
//             for (int j = 1; j <= noSpace; j++) {
//                 System.out.print(" ");
//             }
//             // Print stars
//             for (int j = 1; j <= noOfStars; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//             noSpace--; // Decrease spaces for the next row
//             noOfStars += 2; // Increase stars for the next row
//         }

//         // Lower part of the diamond
//         noSpace = 1;
//         noOfStars = (n - 1) * 2 - 1; // Initial stars for the lower part
//         for (int i = 1; i < n; i++) {
//             // Print spaces
//             for (int j = 1; j <= noSpace; j++) {
//                 System.out.print(" ");
//             }
//             // Print stars
//             for (int j = 1; j <= noOfStars; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//             noSpace++; // Increase spaces for the next row
//             noOfStars -= 2; // Decrease stars for the next row
//         }
//     }
// }
