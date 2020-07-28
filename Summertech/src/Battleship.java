import java.util.Scanner;
public class Battleship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] [] board = new String [10][10];
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++) {
				board[i][j] = "* ";
			}
		}
		boardPrint(board);
	}

	public static void boardPrint(String [][] board) {
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	public static void shipPlacing() {
		Scanner input = new Scanner(System.in);
		System.out.println("Which ship would you like to place? (5,4,3c,3s,2)");
		String placenum = input.next();
		boolean x = false;

		while(x != false) {
			if(placenum.equals("5")) {
				System.out.println("Please pick your first X point");
				int x1 = input.nextInt()-1;
				System.out.println("Please pick your first Y point");
				int y1 = input.nextInt()-1;

				System.out.println("Please pick your second X point");
				int x2 = input.nextInt()-1;
				System.out.println("Please pick your second Y point");
				int y2 = input.nextInt()-1;

				if(x1 - x2 == 0 || x2 - x1 == 0 ) {
					if(y1 - y2 > y2 - y1) {
						for(int i = 0; i < 5; i++) {
							board[x1][y1 + i] = "+";
						}
					}
					else if(y2 - y1 > y1 - y2) {
						for(int i = 0; i < 5; i++) {
							boardPrint(board[x1][y2 + i] = "+");
						}
					}
				}
				else if(y1 - y2 == 0 || y2 - y1 == 0) {
					if(x1 -)
					
					
			}
		}
	}


	//point selection
	System.out.println("Please pick your first X point");
	int x1 = input.nextInt();
	System.out.println("Please pick your first Y point");
	int y1 = input.nextInt();

	System.out.println("Please pick your second X point");
	int x2 = input.nextInt();
	System.out.println("Please pick your second Y point");
	int y2 = input.nextInt();
}
}

