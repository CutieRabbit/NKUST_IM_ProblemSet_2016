import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String data = cin.next();
		String[] split = data.split(",");
		int a = Integer.parseInt(split[0]);
		int b = Integer.parseInt(split[1]);
		while((a%=b)>0 && (b%=a)>0);
		System.out.println(a);
	}
	
}
