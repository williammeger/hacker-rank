import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
      String ans="";
      // Complete the code     
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)

      boolean even = isEven(n);

      if(!even) {
         ans = "Weird";
      } else if (even && (n >= 2 && (n <= 5)) {
         ans = "Not Weird"; 
      } else if (even && (n >= 6 && n <= 20)) {
         ans = "Weird";    
      } else if (even && (n > 20)) {
         ans = "Not Weird";   
      } 
      System.out.println(ans);
   }
   public static boolean isEven(int i) {
      return(i % 2 == 0 ? true : false);
   }
}