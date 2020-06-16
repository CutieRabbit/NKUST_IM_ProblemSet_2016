import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String data = cin.nextLine();
		String[] split = data.split(",");
		double x = Double.parseDouble(split[0]);
		double n = Double.parseDouble(split[1]);
		double ans = 1;
		double b = 1;
		double c = 1;
		for(int i = 1; i <= n; i++) {
			b *= i;
			c *= x;
			ans += c / b;
		}
		System.out.println(String.format("%.9f", ans));
	}
	
}
