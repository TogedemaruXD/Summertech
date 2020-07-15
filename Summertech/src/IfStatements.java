import java.util.Scanner;

public class IfStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the calculator. What operation would you like to do?(+,-,*,/)");
		String answer = input.next();
		
		if (answer.equals("add") || answer.equals("Add") || answer.equals("+")) 
				{
				System.out.println("What numbers would you like to add?");
				System.out.println("Type your first number");
				float add1 = input.nextFloat();
				System.out.println("Type the second number you want to add");
				float add2 = input.nextFloat();
				
				float addanswer = add1 + add2;
				System.out.println(addanswer);
				}
		else if(answer.equals("minus") || answer.equals("-"))
			{
				System.out.println("What numbers would you like to subtract?");
				System.out.println("Type your first number");
				float sub1 = input.nextFloat();
				System.out.println("Type the second number");
				float sub2 = input.nextFloat();
					
				float subanswer = sub1 - sub2;
				System.out.println(subanswer);
			}
		else if(answer.equals("multiply") || answer.equals("x") || answer.equals("*"))
			{
				System.out.println("What numbers would you like to multiply?");
				System.out.println("Type your first number");
				float mul1 = input.nextFloat();
				System.out.println("Type the second number");
				float mul2 = input.nextFloat();
				
				float mulanswer = mul1 * mul2;
				System.out.println(mulanswer);
			}
		else if(answer.equals("divide") || answer.equals("/"))
			{
				System.out.println("What numbers would you like to divide?");
				System.out.println("Type your first number");
				float div1 = input.nextFloat();
				System.out.println("Type the second number");
				float div2 = input.nextFloat();
				
				float divanswer = div1 / div2;
				System.out.println(divanswer);
			}
		else
			{
				System.out.println("Please try again.");
			}
		input.close();
		}

}
