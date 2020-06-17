import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String str = cin.next();
		int sum = 0;
		for(int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';
		}
		if(sum % 3 == 0) {
			System.out.println("Y");
		}else {
			System.out.println("N");
		}
	}
}
