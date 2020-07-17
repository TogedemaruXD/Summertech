import java.util.Scanner;
import java.lang.Math;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/* Rock = 0
		 * Paper = 1
		 * Scissors = 2
		 */
		boolean x = true;
		while (x = true) {	
			String[] choices = {"Rock", "Paper", "Scissors"};
			String computerChoice = choices[(int)(Math.random()*3)];
			System.out.println("Rock, Paper or Scissors?");
			String userinput = input.next();
			if(!userinput.equals("Rock") && !userinput.equals("Paper") && !userinput.equals("Scissors")) {
				System.out.println("Please try again, Rock Paper or Scissors?");	
			} else {
				if(userinput.equals(computerChoice)){
					System.out.println("You tied");
				} else if((userinput.equals("Rock") && computerChoice.equals("Scissors")) || 
					  (userinput.equals("Paper") && computerChoice.equals("Rock")) ||
					  (userinput.equals("Scissor") && computerChoice.equals("Paper"))) {
					System.out.println("You won");
				} else {
					System.out.println("You lost");
				}
			}
		}
	input.close();
	}
}
