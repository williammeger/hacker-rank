import java.util.*;

public class Solution {
    public static void main(String[] args) {
        
        final double BYTE_LOWER = (int) -(Math.pow(2,7)); //-128
        final double BYTE_UPPER = Math.pow(2,7) - 1; //127

        final double SHORT_LOWER = (double) -(Math.pow(2,15)); // -32,768
        final double SHORT_UPPER = (double) (Math.pow(2,15)) - 1; // 32,767

        final 

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i=0; i < t; i++) {

            try {
            long x = sc.nextLong();
            System.out.println(x+ " can be fitted in:");
            if(x>=-128 && x<=127) System.out.println("* byte");
            if(x>=-


            }
            catch(Exception e) {
                System.out.println(sc.nextInt() + " can't be fitted anywhere.");
            }
            
        }
    }
}
