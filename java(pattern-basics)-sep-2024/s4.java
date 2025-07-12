//input:123456(even no of digits)
//output:214365   //swap 2 digits

import java.util.*;
class s4{
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
        int num=reversedNum(n);
        while(num!=0)
        {
            int rem=num%100;
            result=result*100+rem;
            num/=100;
            

        }
        System.out.print(result);
    }
}