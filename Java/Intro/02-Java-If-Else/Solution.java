import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        boolean even = isEven(n);

        if (!even){
            ans = "Weird";
        } else if (even && (n >= 2 && n <= 5)) {
            ans = "Not Weird";
        } else if (even && (n >= 6 && n <= 20)) {
            ans = "Weird";
        } else if (even && (n > 20)) {
            ans = "Not Weird";
        }
        System.out.println(ans);
    }
    public static boolean isEven(int a) {
        return (a & 1) == 0;
    }
}
