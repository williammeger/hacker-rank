import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        Calendar cal = new GregorianCalendar(year, month - 1, day);
        String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG, Locale.getDefault());
        System.out.println(dayOfWeek.toUpperCase());
    }
}
