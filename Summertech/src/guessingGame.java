import java.lang.Math;
import java.util.Scanner;
public class guessingGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		int number = (int)(Math.random()*100);
		int guess = -1;
		
		while(guess != number)
		{
			System.out.println("guess a number");
			guess = input.nextInt();
			
			if (guess > number)
			{
				System.out.println("Your number is too high!");
			}
			else if (number > guess) 
			{
				System.out.println("Your number is too low!");
			}
			else
			{
				System.out.println("You guessed it!");
			}
			
			
		}
		input.close();
	}

}
