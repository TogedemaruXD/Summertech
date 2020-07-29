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
		boardPrint(p1);
		shipPlacing(p1);
		boardPrint(p2);
		shipPlacing(p2);
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
	public static String[] placeShip(String placenum, Scanner input, String[][] board) {
		String[] ships = {"5", "4", "3c", "3s", "2"};
		int index = 0;
		for(String ship: ships) {
			if(placenum != "" && placenum.equals(ship)) {
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
				ships[index] = "";
				System.out.println("Ship " + ships[index] + " has been placed.");
			}
			index ++;
		}
		return ships;
	}
	public static void shipPlacing(String [][] board) {
		Scanner input = new Scanner(System.in);
		boolean x = false;
		String[] ships = {"5", "4", "3c", "3s", "2"};
		while(x != true) {
			System.out.print("Which ship would you like to place? (");
			for(String ship: ships) {
				if (ship.equals("")) {
					continue;
				}  
				if(ship.equals("2")) {
					System.out.print(ship);
					break;
				}
				System.out.print(ship + ", ");
			}
			System.out.print(")");
			String placenum = input.next();
			ships = placeShip(placenum, input, board);
			x = true;
			for(String ship: ships) {
				if(ship != "") {
					x = false;
					break;
				}
			}
			if(x) {
				System.out.println("ships placed");
			}
		}
	}
	public static void shipdestroy(String [][] board) {
		Scanner input = new Scanner(System.in);
		System.out.println("Choose a location to destroy");
		System.out.println("Select your X point");
		int destroyX = input.nextInt()-1;
		System.out.println("Select your Y point");
		int destroyY = input.nextInt()-1;
		input.close();
	}

	//point selection
	/*System.out.println("Please pick your first X point");
		int x1 = input.nextInt();
		System.out.println("Please pick your first Y point");
		int y1 = input.nextInt();

		System.out.println("Please pick your second X point");
		int x2 = input.nextInt();
		System.out.println("Please pick your second Y point");
		int y2 = input.nextInt(); */
}


