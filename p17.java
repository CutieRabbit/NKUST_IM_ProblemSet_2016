import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		Set<Integer> visited = new HashSet<Integer>();
		for(int i = 2; i <= 100000; i++) {
			for(int j = i+i; j <= 100000; j+=i) {
				visited.add(j);
			}
		}
		List<String> answer = new ArrayList<String>();
		String data = cin.next();
		String[] split = data.split(",");
		int a = Integer.parseInt(split[0]);
		int b = Integer.parseInt(split[1]);
		for(int i = a; i <= b; i++) {
			if(!visited.contains(i)) System.out.println(i);
		}
	}
}
