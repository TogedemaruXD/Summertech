import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean x = false;
		while(x != true) {
			//asks users for operation they would like to conduct
			System.out.println("what would you like to do?");
			System.out.println("add, minus, multiply, divide");
			String userinput = input.next();

			//adding
			if(userinput.equals("add") || userinput.equals("+")){
				System.out.println("what numbers would you like to add?");
				System.out.println("please type the 1st number");
				int add1 = input.nextInt();
				System.out.println("please type the 2nd number");
				int add2 = input.nextInt();
				System.out.println(add(add1,add2));

				System.out.println("would you like to continue using the calculator?");
				String contUse = input.next();
				if(contUse.equals("yes")) {
					continue;
				}
				else if(contUse.equals("no")) {
					x = true;
				}
			}
			//subtraction
			else if(userinput.equals("minus") || userinput.equals("-")){
				System.out.println("what numbers would you like to subtract?");
				System.out.println("please type the 1st number");
				int minus1 = input.nextInt();
				System.out.println("please type the 2nd number");
				int minus2 = input.nextInt();
				System.out.println(minus(minus1,minus2));

				System.out.println("would you like to continue using the calculator?");
				String contUse = input.next();
				if(contUse.equals("yes")) {
					continue;
				}
				else if(contUse.equals("no")) {
					x = true;
				}
			}
			//multiply
			else if(userinput.equals("multiply") || userinput.equals("*") || userinput.equals("x")){
				System.out.println("what numbers would you like to multiply?");
				System.out.println("please type the 1st number");
				int mult1 = input.nextInt();
				System.out.println("please type the 2nd number");
				int mult2 = input.nextInt();
				System.out.println(multiply(mult1,mult2));

				System.out.println("would you like to continue using the calculator?");
				String contUse = input.next();
				if(contUse.equals("yes")) {
					continue;
				}
				else if(contUse.equals("no")) {
					x = true;
				}
			}
			//divide
			else if(userinput.equals("divide") || userinput.equals("/")){
				System.out.println("what numbers would you like to divide?");
				System.out.println("please type the 1st number");
				int div1 = input.nextInt();
				System.out.println("please type the 2nd number");
				int div2 = input.nextInt();
				System.out.println(divide(div1,div2));

				System.out.println("would you like to continue using the calculator?");
				String contUse = input.next();
				if(contUse.equals("yes")) {
					continue;
				}
				else if(contUse.equals("no")) {
					x = true;
				}
			}
		}
		input.close();
	}

	public static int add(int x, int y) {
		return x + y;
	}

	public static int minus(int x, int y) {
		return x - y;
	}

	public static int multiply(int x, int y) {
		return x * y;
	}

	public static int divide(int x, int y) {
		return x / y;
	}
}

