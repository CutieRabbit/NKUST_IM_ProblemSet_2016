import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String data = cin.next();
		String[] array = data.split(",");
		for(int i = 0; i < array.length; i++) {
			int x = Integer.parseInt(array[i]);
			if(x > 90) continue;
			int c = Math.min(90, x+10);
			array[i] = String.valueOf(c);
		}
		System.out.println(String.join(",", array));
	}
}
