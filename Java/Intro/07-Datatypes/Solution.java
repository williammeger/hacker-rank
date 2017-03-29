import java.util.*;

public class Solution {
    public static void main(String[] args) {
        
        final double BYTE_LOWER = -(Math.pow(2,7)); //-128
        final double BYTE_UPPER = Math.pow(2,7) - 1; //127

        final double SHORT_LOWER = -(Math.pow(2,15)); // -32,768
        final double SHORT_UPPER = Math.pow(2,15) - 1; // 32,767

        final double INT_LOWER = -(Math.pow(2,31));
        final double INT_UPPER = Math.pow(2,31) - 1; 

        final double LONG_LOWER = -(Math.pow(2,63));
        final double LONG_UPPER = Math.pow(2,63) - 1;

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i=0; i < t; i++) {

            try {
            long x = sc.nextLong();
            System.out.println(x+ " can be fitted in:");
            if(x>=BYTE_LOWER && x<=BYTE_UPPER) System.out.println("* byte");
            if(x>=SHORT_LOWER && x<=SHORT_UPPER) System.out.println("* short");
            if(x>=INT_LOWER && x<=INT_UPPER) System.out.println("* int");
            if(x>=LONG_LOWER && x<=LONG_UPPER) System.out.println("* long");
            }
            catch(Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}
