import java.util.Scanner;
public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Type Your Name!!");
		String name = input.nextLine();
		
		System.out.println("Type Your Age!!");
		int age = input.nextInt();
		input.nextLine();
		
		System.out.println("Type something fun about yourself!");
		String funFact = input.nextLine();
		
		System.out.println("My name is " + name + ". I am  " + age + ". A fun fact about me is that " + funFact +". ");
		
		input.close();
	}

}
