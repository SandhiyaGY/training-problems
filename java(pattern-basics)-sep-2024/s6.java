//input:n=123456
//output:12 //sum of all even position




import java.util.*;
class s6{
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
            int rem=(num%100)/10;
            result=result+rem;
            num/=100;
            

        }
        System.out.print(result);
    }
}