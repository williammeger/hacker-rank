import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int stringCount = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i <= stringCount; i++) {
              String s = sc.nextLine();
              char[] stringAsCharArray = s.toCharArray();
              for (int j = 0; j < stringAsCharArray.length; j++) {
                if (j % 2 == 0) {
                  System.out.print(stringAsCharArray[j]);
                }
              }
              System.out.print(" ");
              for (int j = 0; j < stringAsCharArray.length; j++) {
                if (j % 2 != 0) {
                   System.out.print(stringAsCharArray[j]);
                }
              }
            System.out.println();
            }    
        }
    }
}