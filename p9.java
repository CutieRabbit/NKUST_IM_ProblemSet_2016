import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int ans = 1;
		for(int i = 2; i <= n; i++) {
			boolean find = false;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) find = true;
			}
			if(find == true) continue;
			ans += i;
		}
		System.out.println(ans);
	}
	
}
