import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		String min = str.substring(0,n);
		String max = min;
		String temp = "";
		for (int i = 0; i < str.length() - (n-1); i++) {
			temp = str.substring(i, i + n);
			if(temp.compareTo(min) < 0) {
				// temp is smaller than min
				min = temp;
			} else if (temp.compareTo(max) > 0) {
				// max is greater than temp
				max = temp;
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
}