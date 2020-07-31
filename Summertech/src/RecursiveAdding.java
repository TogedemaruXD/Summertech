import java.util.Scanner;

public class RecursiveAdding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("input 1st number to add recursively");
		int num = input.nextInt();
		System.out.println("input 2nd number to add recursively");
		int num2 = input.nextInt();
		System.out.println(add(num, num2));
	}

	public static int add(int x, int y) {
		
		if(y == 0) {
			return x;
		}
		x++;
		y--;
		add(x,y);
		return add(x,y);
	}
}
