import java.util.*;
public class Solution {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int stringCount = sc.nextInt();
            sc.nextLine();
            for (int a = 0; a <= stringCount; a++) {
              String str = sc.next();
              printEvenOdd(str);
            }
        }
    }  
    public static void printEvenOrOdd (String s) {
      StringBuffer even = new StringBuffer();
      StringBuffer odd = new StringBuffer();
      for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        // bitwise operation check on odd/even indices
        if ((i & 1) == 0) {
          even.append(c);
        } else {
          odd.append(c);
        }
      }
    System.out.println(even + " " + odd);
    }
}