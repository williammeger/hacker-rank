import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.print(str.substring(start,end));
    }
}
