import java.util.*;
public class Skill2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int students = sc.nextInt();
        int[] vehicle = new int[n];
        for (int i = 0; i < n; i++)
        {
            vehicle[i] = sc.nextInt();
        }
        int count=0;  
        for (int ctr = 0; ctr < (1 << n); ctr++)
        {
            int vehicleSum = 0;
            for (int shift = 0; shift < n; shift++)
            {
                if ((ctr & (1 << shift)) != 0)
                {
                    vehicleSum += vehicle[shift];
                }
            }   
            if (vehicleSum == students)
            {
                count++;
            }
        } 
        System.out.print(count);
        sc.close();
    }
}
