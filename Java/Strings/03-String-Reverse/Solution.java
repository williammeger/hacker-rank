import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		isPalindrome(str);
		System.out.println((isPalindrome) ? "Yes" : "No");
	}
	public static boolean isPalindrome(String ss) {
		int n = ss.length();
			for (int i = 0; i < (n/2); i++) {
				if (ss.charAt(i) != ss.charAt(n - i - 1)) {
					return false;
				}
			}
		return true;
	}
}