import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		cin.nextLine();
		String[][] array = new String[n][n];
		for(int i = 0; i < n; i++) {
			String str = cin.nextLine();
			String[] split = str.split(",");
			for(int j = 0; j < n; j++) {
				array[j][i] = split[j];
			}
		}
		for(int i = 0; i < n; i++) {
			CharSequence[] temp = array[i];
			System.out.println(String.join(",", temp));
		}
	}
	
}
