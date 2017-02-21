import java.util.*;

public class Solution {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int base = sc.nextInt();
    factorial(base);
  }

  public static int factorial(int n) {
    if (n <= 1) {
      return 1;
    } else {
      return n * factorial(n-1);
    }
  }
} 