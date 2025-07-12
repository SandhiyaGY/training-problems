import java.util.*;
//contail all a-z upper and lower
public class Skill10 {
    public static boolean checkAlpha(String str) {
        int flag1 = 0;  //for lower
        int flag2 = 0;  //for upper
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') { 
                flag1 |= (1 << (ch - 'a'));  
            }
            if (ch >= 'A' && ch <= 'Z') {
                flag2 |= (1 << (ch - 'A'));  
            }
        }
        return flag1 == (1 << 26) - 1 && flag2== (1 << 26) - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean result = checkAlpha(str);
        System.out.print(result);
        sc.close();
        
    }
}
