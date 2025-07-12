//input:1234567(both even & odd no of digits)
//output:2143657   //swap 2 digits

import java.util.*;
class s5{
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
        int result=0;
        int temp=n;  //temp variable to find the count of digits
        int num=reversedNum(n);
        int count=0;
        while(temp!=0)
        {
            count++;
            temp/=10;
        }
        if(count%2==0)
        {
            while(num!=0)
            {
            int rem=num%100;
            result=result*100+rem;
            num/=100;
            }
        }
        else
        {
            int lastDigit=n%10;
            n/=10;
            n=reversedNum(n);
            while(n!=0)
            {
            int rem=n%100;
            result=result*100+rem;
            n/=100;
        }
        result=result*10+lastDigit;


        }
        System.out.print(result);
    }
}