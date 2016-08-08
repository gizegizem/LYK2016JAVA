package tr.org.linux.kamp2016.helloworld;

public class CarpimTablosu {

	public static void main(String[] args) {
		int[][] multitable = initializeMultiplicationTable(10);
		arayToPrint(multitable);

	}

	public static int[][] initializeMultiplicationTable(int size) {
		int[][] board = new int[size][size];

		for (int i = 0; i < board.length; i++) {

			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = (i + 1) * (j + 1);
				;

			}

		}
		return board;
	}

	public static void arayToPrint(int[][] board) {
		for (int k = 0; k < board.length; k++) {
			for (int l = 0; l < board[k].length; l++) {
				System.out.print(board[k][l] + " ");

			}
			System.out.print("\n");
		}

	}

}
