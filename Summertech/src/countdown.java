import java.util.Scanner;

public class countdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("input a number to countdown from");
		int user = input.nextInt();
		countdown(user);
		input.close();
	}
	public static int countdown(int x) {
		if(x == 0) {
			return x;
		}
		x -= 1;
		System.out.println(x);
		countdown(x);
		return x;
		
		
	}

}
