import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> answer = new ArrayList<Integer>();
		String data = cin.next();
		String[] split = data.split(",");
		for(int i = 0; i < split.length; i++) {
			list.add(Integer.parseInt(split[i]));
		}
		data = cin.next();
		split = data.split(",");
		for(int i = 0; i < split.length; i++) {
			int x = Integer.parseInt(split[i]);
			if(list.contains(x)) answer.add(x);
		}
		for(int i = 0; i < answer.size(); i++) {
			System.out.print(answer.get(i) + (i == answer.size()-1 ? "" : ","));
		}
	}
	
}
