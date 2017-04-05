import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        // Sum the lengths
        System.out.println(A.length() + B.length());

        // Compare lexicographically
       int result = A.compareTo(B);
       if (result <= 0) {
           System.out.println("No");
       } else {
           System.out.println("Yes");
       }
       // Titlecase A and B
       System.out.println(titleCase(A) + " " + titleCase(B));
    }
    public static String titleCase(String str) {
        return (str.substring(0,1).toUpperCase() + str.substring(1));
    }
}
