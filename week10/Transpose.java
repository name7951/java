package week10;

import java.util.Random;
import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random generator = new Random();

		// 행과 열의 크기를 입력받는다
		System.out.print("행의 크기는? ");
		int row = input.nextInt();
		System.out.print("열의 크기는? ");
		int column = input.nextInt();

		// 2차원 배열 matrix를 만들고, 난수로 채운다
		int[][] matrix = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				int k = generator.nextInt(50);
				matrix[i][j] = k;
			}
		}

		// 이차원 배열을 출력한다
		printMatrix(matrix);
		System.out.println();

		// 전치행렬을 구한다
		int[][] tMatrix;
		tMatrix = new int[column][row]; // n x m 크기의 2차원 배열을 만단다

		// 전치행렬을 출력한다
		transpose(matrix);

		input.close();
	}

	// 전치행렬을 구하는 메소드
	public static void transpose(int[][] array) {
		
		int[][] tMatrix = new int[array[0].length][array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				tMatrix[j][i] = array[i][j];
			}
		}
		
		printMatrix(tMatrix);
	}

	// 이차원 배열을 출력하는 메소드
	public static void printMatrix(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				System.out.print(array[i][j] + "\t");
			System.out.println();
		}
		System.out.println();

	}

}
