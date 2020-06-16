import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		long ans = 1;
		for(int i = 1; i <= n; i++) {
			ans *= i;
		}
		int count = 0;
		String str = String.valueOf(ans);
		for(int i = 0; i < str.length(); i++) {
			count += str.charAt(i) - '0';
		}
		System.out.println(ans + ", " + count);
	}
  
}
