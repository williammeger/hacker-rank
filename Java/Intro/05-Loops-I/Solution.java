import java.util.*;

public class Solution {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result = n * i;
            System.out.println(n + " x " + i + " = " + result); 
        }
    }
}
