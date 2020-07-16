import java.lang.Math;
import java.util.Scanner;
public class rockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		/* Rock = 0
		 * Paper = 1
		 * Scissors = 2
		 */
		boolean x = true;
		while (x = true)
		{	int number = (int)(Math.random()*3);
			System.out.println("Rock, Paper or Scissors?");
			String userinput = input.nextLine();
			
			if (userinput.equals("Rock") && number == 0){
				System.out.println("You tied");
			}
			else if (userinput.equals("Rock") && number == 1){
				System.out.println("You lost");
			}
			else if (userinput.equals("Rock") && number == 2){
				System.out.println("You Won");
			}
			else if (userinput.equals("Paper") && number == 0){
				System.out.println("You Won");
			}
			else if (userinput.equals("Paper") && number == 1){
				System.out.println("You Tied");
			}
			else if (userinput.equals("Paper") && number == 2){
				System.out.println("You Lost");
			}
			else if (userinput.equals("Scissors") && number == 0){
				System.out.println("You Lost");
			}
			else if (userinput.equals("Scissors") && number == 1){
				System.out.println("You Won");
			}
			else if (userinput.equals("Scissors") && number == 2){
				System.out.println("You Tied");
			}
			else
			{
			System.out.println("Please try again, Rock Paper or Scissors?");	
			}
		}
	input.close();
		
	}

}
