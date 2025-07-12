import java.util.*;
public class Skill9 {
    public static void onesPosition(int num, int shift) {
        if ((1 << shift) > num) {
            return;
        }
        onesPosition(num, shift + 1);
        if ((num & (1 << shift)) != 0) {
            System.out.print(shift+1 + " "); 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        onesPosition(n, 0);  
        sc.close();
    }
}
