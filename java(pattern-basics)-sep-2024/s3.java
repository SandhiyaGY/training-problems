//input:120453     (consider 0 as even)
//output:153204   //first even number then odd numbers in given order

import java.util.*;
class s3{
    static int reversedNum(int n){
        int reversed=0;
        while(n!=0)
        {
            int rem=n%10;
            reversed=reversed*10+rem;
            n/=10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int evenNo=0;
        int oddNo=0;
        int evenCount=0;
        int reversed=reversedNum(n);
        while(reversed!=0)
        {
            int rem=reversed%10;
            if(rem%2==0)
            {
                evenNo=evenNo*10+rem;
                evenCount++;

            }
            else
            {
                oddNo=oddNo*10+rem;

            }
            reversed/=10;
        }
        int result=oddNo*(int)Math.pow(10,evenCount)+evenNo;
        System.out.print(result);
    }
}





// other method
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int evenNo=0;
        // int oddNo=0;
        // int evenCount=0;
        // int reversed=n;
        // int temp=n;
        // int pv=1;
        // while(temp!=0)
        // {
        //     pv*=10;
        //     temp/=10;
        // }
        // pv/=10;
        // while(pv!=0)
        // {
        //     int rem=(reversed/pv)%10;
        //     if(rem%2==0)
        //     {
        //         evenNo=evenNo*10+rem;
        //         evenCount++;

        //     }
        //     else
        //     {
        //         oddNo=oddNo*10+rem;

        //     }
        //     pv/=10;
        // }
        // int result=oddNo*(int)Math.pow(10,evenCount)+evenNo;
        // System.out.print(result);