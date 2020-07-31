import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input a number to produce factorial");
		int user = input.nextInt();
		System.out.println(factorial(user));
		input.close();
	}
	public static int factorial(int x) {



		if(x == 0) {
			return 1;
		}
		int answer = x *factorial(x-1);
		return answer;

	}
	
}
