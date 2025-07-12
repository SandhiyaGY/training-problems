import java.util.*;
public class Main {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int v=sc.nextInt();
            int e=sc.nextInt();
            ArrayList<ArrayList<Integer>> a=new ArrayList<>();
            for(int i=0;i<v;i++){
                a.add(new ArrayList<>());
            }
            for(int i=0;i<e;i++){
                int start=sc.nextInt();
                int end=sc.nextInt();
                a.get(start).add(end);
            }
            for(int i=0;i<v;i++){
                System.out.print(a.get(i));
            }
            // for(int i=0;i<v;i++){
            //     for(int j=0;j<v;j++){
            //         System.out.print(a.get(i).get(j)+"->");
            //     }
            //     System.out.println();
            // }
        }
    }
}
