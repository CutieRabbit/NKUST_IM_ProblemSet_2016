import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static class Person implements Comparable<Person>{
		String name;
		int age;
		int height;
		int weight;
		public Person(String name, int age, int height, int weight) {
			this.name = name;
			this.age = age;
			this.height = height;
			this.weight = weight;
		}
		@Override
		public int compareTo(Person o) {
			return o.age - this.age;
		}
		public String getData() {
			return name + "," + age + "," + height + "," + weight;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		List<Person> list = new ArrayList<Person>();
		while(cin.hasNext()) {
			String str = cin.next();
			String[] split = str.split(",");
			String name = split[0];
			int age = Integer.parseInt(split[1]);
			int height = Integer.parseInt(split[2]);
			int weight = Integer.parseInt(split[3]);
			Person person = new Person(name,age,height,weight);
			list.add(person);
		}
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getData());
		}
	}
	
}
