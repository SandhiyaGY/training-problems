import java.util.*;
public class Skill4 {
    public static void printBinary(int decimal)
    {
        if (decimal == 0)
        {
            return;
        }
        printBinary(decimal / 2);
        System.out.print(decimal % 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        System.out.print("Binary: ");
        printBinary(decimal);
        sc.close();
    }
}
