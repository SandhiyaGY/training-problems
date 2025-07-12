import java.util.*;
public class Skill5 {
    public static void printOctal(int decimal) {
        if (decimal == 0) {
            return;
        }
        printOctal(decimal / 8);
        System.out.print(decimal % 8);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        System.out.print("Octal: ");
        printOctal(decimal);
        sc.close();
    }
}

