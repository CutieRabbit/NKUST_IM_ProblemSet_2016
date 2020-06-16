import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String data = cin.next();
		String[] split = data.split(",");
		double[] array = new double[split.length];
		for(int i = 0; i < array.length; i++) {
			array[i] = Double.parseDouble(split[i]);
		}
		double sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		double mean = sum*1.0/array.length;
		double dev_a = 0;
		for(int i = 0; i < array.length; i++) {
			dev_a += (array[i]-mean)*(array[i]-mean);
		}
		double dev = Math.sqrt(dev_a/(array.length-1));
		System.out.println(String.format("%.4f,%.4f", mean, dev));
	}
	
}
