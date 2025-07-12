// input:1234
// output:4231 //swap first and last digit

import java.util.*;
class s2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int noOfDigits=0;
        int temp=n;
        while(temp%10!=0)
        {
            noOfDigits++;
            temp/=10;
        }
        int powOfTen=(int)Math.pow(10,noOfDigits-1);
        int firstDigit=n/powOfTen;
        int lastDigit=n%10;
        int remainingDigits=(n%powOfTen)/10;
        int result1=lastDigit*(powOfTen/10)+remainingDigits; // adding remaining numbers to the lastdigit
        int result2=result1*10+firstDigit;  //adding firstdigit to the result1
        System.out.println(result2);

    }
}
