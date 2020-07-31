import java.util.Scanner;

public class RecursiveMultiplication {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input 1st number to multiply recursively");
		int num = input.nextInt();
		System.out.println("input 2nd number to multiply recursively");
		int num2 = input.nextInt();
		System.out.println(mult(num, num2));
	}
	public static int mult(int x, int y) {
		if(y == 0) {
			return x;
		}
		x += x;
		y--;
		mult(x,y);
		return mult(x,y);
	}
}
