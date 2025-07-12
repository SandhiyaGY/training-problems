// Integer Break Max Product

// Given an integer N, break it into the sum of k positive integers, where k >= 2, and maximize the product of those integers.
// The program must print the maximum product you can get.
// Boundary Condition (s):
// 2 <= N<= 50
// Example Input/Output 1:
// Input:
// 2
// Output:
// 1
// Example Input/Output 2:
// Input:
// 10
// Output:
// 36

import java.util.Scanner;

public class elevate1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(maxProduct(n));
        sc.close();
    }

    public static int maxProduct(int n) {
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }

        int quotient = n / 3;
        int remainder = n % 3;

        if (remainder == 1) {
            return (int) Math.pow(3, quotient - 1) * 4;
        } else if (remainder == 2) {
            return (int) Math.pow(3, quotient) * 2;
        } else {
            return (int) Math.pow(3, quotient);
        }
    }
}
