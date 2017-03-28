import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (i=0;i<t;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int series = a;

            for(int j = 0; j < n; j++) {
                // bit shift for power of 2
                series += (1<<j) * b;
                System.out.print(series + " ");
            }
        System.out.println();        
        }
        in.close();
    }
}
