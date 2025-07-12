import java.util.*;

public class Skill6 {
    public static void printHexadecimal(int decimal) {
        if (decimal == 0) {
            return;
        }
        printHexadecimal(decimal / 16);
        int remainder = decimal % 16;
        if (remainder < 10)
        {
            System.out.print(remainder);
        }
        else
        {
            System.out.print((char) ('A' + (remainder - 10)));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        System.out.print("Hexadecimal: ");
        printHexadecimal(decimal);
        sc.close();
    }
}
