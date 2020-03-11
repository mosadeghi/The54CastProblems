/*
	Khayam Triangle
	
	The54Cast Episode 001 
	aparat.com/The54Cast
	telegram.me/The54Cast
	
	by
	
	Amirmohammad Mosadeghi
	mosadeghi.ce.guilan@gmail.com
	
*/
import java.util.Scanner;

public class KhayamTriangle {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Please enter a number : ");
		int n = reader.nextInt();
		
		for(int i=0;i<=n;i++) {
			showLine(i);
			System.out.print('\n');
		}
		
		System.out.println("Done.");

	}
	
	static void showLine(int n) {
		for (int i=0;i<=n;i++) {
			System.out.print((int)tarkib(n,i));
			System.out.print('\t');
		}
	}
	
	static double tarkib(int n, int r) {
		return factorial(n) / (factorial(r) * factorial(n-r));
	}
	
	static long factorial(int n) {
		long total = 1;
		for (int i=1;i<=n;i++)
			total = total * i;
		return total;
	}
}
