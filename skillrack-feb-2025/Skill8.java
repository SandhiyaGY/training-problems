import java.util.Scanner;
public class Skill8 {
    public static void printSquare(int num)
    {
        if (num == 0) {
            return;
        }
        printSquare(num/10);
        int digit=num%10;
        System.out.print(digit*digit);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        printSquare(num);
        sc.close();
        
    }
}
