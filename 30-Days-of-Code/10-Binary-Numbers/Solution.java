import java.util.*;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int total = countBinaryOnes(n);
    System.out.println(total);
  }
  public static int countBinaryOnes(int a) {
    int counter = 0;
    int max = 0;
    while (a > 0) {
      if ((a&1) == 1) {
        counter++;
        max = Math.max(counter, max);
      } else {
        counter = 0;
      }
      a = a >> 1;
    } return max;
  }
}