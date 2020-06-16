import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		if(n <= 2000) {
			System.out.println((int)(0.02*n));
		}else if(n > 2000 && n <= 3000) {
			System.out.println((int)(0.03*n));
		}else if(n > 3000 && n <= 4000) {
			System.out.println((int)(0.04*n));
		}else if(n > 4000) {
			System.out.println((int)(0.05*n));
		}
	}
	
}
