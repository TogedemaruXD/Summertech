import java.util.Scanner;
public class Battleship {

	public static String [] [] p1 = new String [10][10];
	public static String [] [] p2 = new String [10][10];
	public static String [] [] p1a = new String [10][10];
	public static String [] [] p2a= new String [10][10];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boardCreate(p1);
		boardCreate(p2);
		boardCreate(p1a);
		boardCreate(p2a);
		boardPrint(p1);
		shipPlacing(p1);
		boardPrint(p2);
		shipPlacing(p2);
		boolean x = false;
		while(x != true) {
			boardPrint(p1a);
			System.out.println();
			shipDestroy(p1,p2a);
			boardPrint(p2a);
			System.out.println();
			shipDestroy(p2,p1a);
			victory(p1,p2);
			if(victory(p1,p2) == true) {
				x = true;
			}
		}


	}
	public static void boardCreate(String [][] board) {
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++) {
				board[i][j] = "* ";
			}
		}
	}
	public static void boardPrint(String [][] board) {
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	public static void shipPlacing(String [][] board) {
		Scanner input = new Scanner(System.in);

		boolean x = false;
		boolean lockShip5 = false;
		boolean lockShip4 = false;
		boolean lockShip3c = false;
		boolean lockShip3s = false;
		boolean lockShip2 = false;

		while(x != true) {
			System.out.println("Which ship would you like to place? (5,4,3c,3s,2)");
			String placenum = input.next();

			if(placenum.equals("5") && lockShip5 == false) {
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
							board[y2 + i][x1] = "+ ";
						}
					}
					else if(y2 - y1 > y1 - y2) {
						for(int i = 4; i >= 0; i--) {
							board[y1 + i][x1] = "+ ";
						}
					}
				}
				else if(y1 - y2 == 0 || y2 - y1 == 0) {
					if(x1 - x2 > x2 - x1) {
						for(int i = 0; i < 5; i++) {
							board[y1][x2 + i] = "+ ";
						}
					}
					else if(x2 - x1 > x1 - x2) {
						for(int i = 4; i >= 0; i--) {
							board[y1][x1 + i] = "+ ";
						}
					}
				}

				else {
					System.out.println("please try again");
				}
				boardPrint(board);
				lockShip5 = true;
				System.out.println("Ship 5 has been placed.");
			}
			else if(placenum.equals("4") && lockShip4 == false) {
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
						for(int i = 0; i < 4; i++) {
							board[y2 + i][x1] = "+ ";
						}
					}
					else if(y2 - y1 > y1 - y2) {
						for(int i = 3; i >= 0; i--) {
							board[y1 + i][x1] = "+ ";
						}
					}
				}
				else if(y1 - y2 == 0 || y2 - y1 == 0) {
					if(x1 - x2 > x2 - x1) {
						for(int i = 0; i < 4; i++) {
							board[y1][x2 + i] = "+ ";
						}
					}
					else if(x2 - x1 > x1 - x2) {
						for(int i = 3; i >= 0; i--) {
							board[y1][x1 + i] = "+ ";
						}
					}
				}
				else {
					System.out.println("please try again");
				}
				boardPrint(board);
				lockShip4 = true;
				System.out.println("Ship 4 has been placed.");
			}
			else if(placenum.equals("3c") && lockShip3c == false) {
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
						for(int i = 0; i < 3; i++) {
							board[y2 + i][x1] = "+ ";
						}
					}
					else if(y2 - y1 > y1 - y2) {
						for(int i = 2; i >= 0; i--) {
							board[y1 + i][x1] = "+ ";
						}
					}
				}
				else if(y1 - y2 == 0 || y2 - y1 == 0) {
					if(x1 - x2 > x2 - x1) {
						for(int i = 0; i < 3; i++) {
							board[y1][x2 + i] = "+ ";
						}
					}
					else if(x2 - x1 > x1 - x2) {
						for(int i = 2; i >= 0; i--) {
							board[y1][x1 + i] = "+ ";
						}
					}
				}
				else {
					System.out.println("please try again");
				}
				boardPrint(board);
				lockShip3c = true;
				System.out.println("Ship 3c has been placed.");
			}
			else if(placenum.equals("3s") && lockShip3s == false) {
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
						for(int i = 0; i < 3; i++) {
							board[y2 + i][x1] = "+ ";
						}
					}
					else if(y2 - y1 > y1 - y2) {
						for(int i = 2; i >= 0; i--) {
							board[y1 + i][x1] = "+ ";
						}
					}
				}
				else if(y1 - y2 == 0 || y2 - y1 == 0) {
					if(x1 - x2 > x2 - x1) {
						for(int i = 0; i < 3; i++) {
							board[y1][x2 + i] = "+ ";
						}
					}
					else if(x2 - x1 > x1 - x2) {
						for(int i = 2; i >= 0; i--) {
							board[y1][x1 + i] = "+ ";
						}
					}
				}
				else {
					System.out.println("please try again");
				}
				boardPrint(board);
				lockShip3s = true;
				System.out.println("Ship 3c has been placed.");
			}
			else if(placenum.equals("2") && lockShip2 == false) {
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
						for(int i = 0; i < 2; i++) {
							board[y2 + i][x1] = "+ ";
						}
					}
					else if(y2 - y1 > y1 - y2) {
						for(int i = 1; i >= 0; i--) {
							board[y1 + i][x1] = "+ ";
						}
					}
				}
				else if(y1 - y2 == 0 || y2 - y1 == 0) {
					if(x1 - x2 > x2 - x1) {
						for(int i = 0; i < 2; i++) {
							board[y1][x2 + i] = "+ ";
						}
					}
					else if(x2 - x1 > x1 - x2) {
						for(int i = 1; i >= 0; i--) {
							board[y1][x1 + i] = "+ ";
						}
					}
				}
				else {
					System.out.println("please try again");
				}
				boardPrint(board);
				lockShip2 = true;
				System.out.println("Ship 2 has been placed.");
			}
			if(lockShip5 == true && lockShip4 == true && lockShip3s == true && lockShip3c == true && lockShip2 == true) {
				x = true;
				System.out.println("ships placed");
			}

		}
	}
	public static void shipDestroy(String [][] board, String [][] boardA) {
		Scanner input = new Scanner(System.in);
		boardPrint(boardA);
		System.out.println("Choose a location to destroy");
		System.out.println("Select your X point");
		int destroyX = input.nextInt()-1;
		System.out.println("Select your Y point");
		int destroyY = input.nextInt()-1;
		if(board[destroyX][destroyY].equals("* ")) {
			System.out.println("Miss!");
			board[destroyX][destroyY] = "O ";
			boardA[destroyX][destroyY] = "O ";
		}
		else if(board[destroyX][destroyY].equals("+ ")) {
			System.out.println("Hit! ");
			board[destroyX][destroyY] = "X ";
			boardA[destroyX][destroyY] = "X ";
		}
		boardPrint(boardA);
	}
	public static boolean victory(String [][] board, String [][] board2) {
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++) {
				if(board[i][j].equals("+ ") || board2[i][j].equals("+ ")){

					return false;
				}
			}
		}
		System.out.println("game over");
		return true;
	}
}


