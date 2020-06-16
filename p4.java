import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String str = cin.next();
		String[] split = str.split(",");
		int a = Integer.parseInt(split[0]);
		int b = Integer.parseInt(split[1]);
		double step = Double.parseDouble(split[2]);
		for(double i = a; i <= b; i += step) {
			double y = 5*i*i + 2*i + 3;
			System.out.println(String.format("x=%.1f y=%.3f", i, y));
		}
	}
	
}
