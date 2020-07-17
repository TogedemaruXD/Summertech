import java.util.Scanner;

public class ticTacToe {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String [] [] board = new String [] []{new String [] {"*", "*", "*"},new String [] {"*", "*", "*"},new String [] {"*", "*", "*"}};

		int userrow;
		int usercol;
		String player = "x";
		while(true){
			//board printing
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					System.out.print(board[i][j] + " ");
				}
				System.out.println();
			} 

			System.out.println("Which row?");
			userrow = input.nextInt() - 1;
			if(userrow > 2 || userrow < 0 ){
				System.out.println("invalid row, try again");
				continue;
			}

			System.out.println("Which Column?");
			usercol = input.nextInt()-1;
			if(usercol > 2 || usercol < 0 ){
				System.out.println("invalid column, try again");
				continue;
			}
			if(board[userrow][usercol] == "*") {
				board[userrow][usercol] = player;
			}
			else {
				System.out.println("spot is already filled, please try again");
				continue;
			}
			int count = 0;
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < 3; j++) {
					if(board[i][j] == "*") {
						count += 1;
					}	
				}	
			}

			if(count == 0) {
				System.out.println("Tie. Game Over");
				break;
			}

			//horizontal wins
			for(int i = 0; i < 3; i++) {
				int count2 = 0;
				for(int j = 0; j < 3; j++) {

					if(board[i][j].equals(player)){
						count2 += 1;
					}
				}
				if(count2 == 3) {
					System.out.println("player " + player + " wins!");
				}
			}

			//vertical wins
			for(int i = 0; i < 3; i++) {
				int count2 = 0;
				for(int j = 0; j < 3; j++) {

					if(board[j][i].equals(player)) {
						count2 += 1;	
					}
				}
				if(count2 == 3){
					System.out.println("player " + player + " wins!");
					break;
				}
			}

			//diagonal wins
			for(int i = 0; i < 3; i++) {
				int count2 = 0;
				if(board[i][i].equals(player)) {
					count2 += 1;
				}
				if(count2 == 3){
					System.out.println("player " + player + " wins!");
					break;
				}
			}


			if(player.equals("x")) {
				player = "o";
			}
			else {
				player = "x";
			}
		}
	}
}
