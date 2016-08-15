package tr.org.linux.kamp2016.array;

import tr.org.linux.kamp2016.string.StringExample;

public class CokboyutluArray {

	public static void main(StringExample[] args) {
		int[][] board = new int[4][4];
		int counter = 0;
		for (int i = 0; i < board.length; i++) {

			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = counter;
				counter++;
			}
		}

		for (int k = 0; k < board.length; k++) {
			for (int l = 0; l < board[k].length; l++) {
				System.out.print(board[k][l] + " ");

			}
			System.out.print("\n");
		}
	}

}