//input:1234
//output:10  //sum of digits

import java.util.*;
class s7
{
    static int sumOfDigits(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=sumOfDigits(n);
        System.out.print(result);
    }
}
