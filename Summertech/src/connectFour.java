import java.util.Scanner;

public class connectFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] [] board = new String [] []{new String [] {"*", "*", "*", "*"},new String [] {"*", "*", "*", "*"},new String [] {"*", "*", "*", "*"},new String [] {"*", "*", "*", "*"}};
		Scanner input = new Scanner(System.in);
		boardPrint(board);
		boolean x = false;
		while(x != true) {
			//row input
			System.out.println("Which Row?");
			int userrow = input.nextInt() - 1;
			
		}
	}
	
	public static void boardPrint(String [][] board) {

		//prints board in function
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();

		}
	}
	input.close();
}
