import java.util.Scanner;

public class Main {
	
	static int gcd(int a, int b) {
		if(b == 0) return a;
		while((a %= b) > 0 && (b %= a) > 0);
		return a+b;
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String data = cin.next();
		String[] split = data.split(",");
		int a = Integer.parseInt(split[0]);
		int b = Integer.parseInt(split[1]);
		int gcd = gcd(a, b);
		System.out.println(a*b/gcd);
	}
}
