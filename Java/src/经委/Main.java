package 经委;

import java.util.Scanner;

class Test {
}

public class Main {
	private static void Level(boolean flag, int[][] matrix, int tR, int tC, int dR, int dC) {
		if (flag) {
			while (tR != dR + 1) {
				System.out.print(matrix[tR++][tC--] + " ");
			}
		} else {
			while (dR != tR - 1) {
				System.out.print(matrix[dR--][dC++] + " ");
			}
		}
	}

	private static void ZGlyph(int[][] matrix) {
		int tC = 0, tR = 0, dC = 0, dR = 0;
		int endR = matrix.length - 1;
		int endC = matrix[0].length - 1;
		boolean flag = false;
		while (tR != endR + 1) {
			Level(flag, matrix, tR, tC, dR, dC);
			tR = tC == endC ? tR + 1 : tR;
			tC = tC == endC ? tC : tC + 1;
			dC = dR == endR ? dC + 1 : dC;
			dR = dR == endR ? dR : dR + 1;
			flag = !flag;
		}
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n1 = in.nextInt();
			int n2 = in.nextInt();
			int[][] matrix = new int[n1][n2];
			for (int i = 0; i < n1; i++) {
				for (int j = 0; j < n2; j++) {
					matrix[i][j] = in.nextInt();
				}
			}
			ZGlyph(matrix);
		}
		in.close();
	}
}
