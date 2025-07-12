import java.util.*;
public class Skill1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int strLength=str.length();
        for(int ctr=0;ctr<(1<<strLength);ctr++)
        {
            for(int shift=0;shift<strLength;shift++)
            {
                if((ctr&(1<<shift))!=0)
                {
                    System.out.print(str.charAt(shift));
                }
            }
            System.out.println();
        }
        sc.close();
    }
}