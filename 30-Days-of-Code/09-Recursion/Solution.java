import java.util.*;

public class Solution {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int base = sc.nextInt();
    System.out.println(factorial(base));
  }

  public static int factorial(int n) {
    return (n > 1) ? n * factorial(n - 1) : 1;
  }
} 