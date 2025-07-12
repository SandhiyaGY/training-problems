

// input:123400
// output:004321 //reversed number

import java.util.*;
class s1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int zeroCount=0;
        int reversedNum=0;
        while(n%10==0)
        {
            zeroCount++;
            n/=10;
        }
        while(n!=0)
        {
            int rem=n%10;
            reversedNum=reversedNum*10+rem;
            n/=10;
           
        }
        while(zeroCount!=0)
        {
            System.out.print(0);
            zeroCount--;
        }
        System.out.print(reversedNum);

    
    }
}


//using string
// Scanner sc = new Scanner(System.in);
// String m = sc.next(); 
// String reversedNum = "";
// for (int i = m.length() - 1; i >= 0; i--) {
//     reversedNum += m.charAt(i);
//     }
// System.out.print(reversedNum); 