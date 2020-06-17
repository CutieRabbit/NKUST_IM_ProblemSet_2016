import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		Set<Integer> visited = new HashSet<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		Scanner cin = new Scanner(System.in);
		String data = cin.next();
		String[] split = data.split(",");
		for(int i = 0; i < split.length; i++) {
			int x = Integer.parseInt(split[i]);
			if(set.contains(x)) {
				 visited.add(x);
			}else {
				set.add(x);
			}
		}
		List<String> answer = new ArrayList<String>();
		for(int a : set) {
			if(visited.contains(a)) continue;
			answer.add(String.valueOf(a));
		}
		System.out.println(String.join(",", answer));
	}
}
