import java.util.*;

public class Skill7 {
    public static int findGcd(int a,int b)
    {
        return (b==0)?a:findGcd(b,a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("GCD or HCF ");
        int result=findGcd(a,b);
        System.out.print(result);
        sc.close();
    }
}
