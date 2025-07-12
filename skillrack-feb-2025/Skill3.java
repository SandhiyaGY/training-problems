import java.util.*;

public class Skill3 {
    //n to 1
    public static void printNto1(int num) {
        if (num == 0) {
            return;
        }
        System.out.print(num);
        printNto1(num - 1);
    }
    // 1 to n
    public static void print1toN(int num) {
        if (num == 0) {
            return;
        }
        print1toN(num - 1);
        System.out.print(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("n to 1: ");
        printNto1(n);
        System.out.print("\n1 to n: ");
        print1toN(n);
        sc.close();
    }
}
