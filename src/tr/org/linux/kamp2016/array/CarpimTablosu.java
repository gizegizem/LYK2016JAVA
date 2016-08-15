package tr.org.linux.kamp2016.array;

import tr.org.linux.kamp2016.string.StringExample;

public class CarpimTablosu {

	public static void main(StringExample[] args) {
		//int[][] multitable = initializeMultiplicationTable(10,10);
		arayToPrint(initializeMultiplicationTable(10,10));

	}

	public static int[][] initializeMultiplicationTable(int size1,int size2) {
		int[][] board = new int[size1][size2];

		for (int i = 0; i < board.length; i++) {

			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = (i + 1) * (j + 1);
			}

		}
		return board;
	}

	public static void arayToPrint(int[][] board) {
		for (int k = 0; k < board.length; k++) {
			for (int l = 0; l < board[k].length; l++) {
				System.out.printf("%-5d",board[k][l]);

			}
			System.out.print("\n");
		}

	}

}
