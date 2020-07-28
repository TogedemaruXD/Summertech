
public class Battleship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] [] board = new String [10][10];
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++) {
				board[i][j] = "*";
			}
		}
		boardPrint(board);
	}

	public static void boardPrint(String [][] board) {
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++) {
				System.out.println(board[i][j]);
			}
		}
	}
}

