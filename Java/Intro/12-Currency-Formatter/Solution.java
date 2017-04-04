import java.util.*;
import java.text.*;

public class Solution {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();

        NumberFormat nfUS = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nfUS.format(payment);

        Locale in = new Locale("en", "IN");
        NumberFormat nfIndia = NumberFormat.getCurrencyInstance(in);
        String india = nfIndia.format(payment);

        NumberFormat nfChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nfChina.format(payment);

        NumberFormat nfFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nfFrance.format(payment); 

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
