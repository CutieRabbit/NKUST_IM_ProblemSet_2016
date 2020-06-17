import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		for(int i = 2; i < n; i++) {
			list.add(list.get(i-1) + list.get(i-2));
		}
		System.out.println(list.get(list.size()-1));
	}
}
