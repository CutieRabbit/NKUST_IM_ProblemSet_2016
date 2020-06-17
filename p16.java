import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String data = cin.next();
		String[] split = data.split(",");
		int a = Integer.parseInt(split[0]);
		int b = Integer.parseInt(split[1]);
		for(int i = a; i <= b; i++) {
			int x = 5*i*i*i+2*i*i+3*i+2;
			System.out.println(String.format("x=%d, y=%d", i, x));
		}
	}
}
