package week5;

import java.util.Scanner;

/**
 * makeTable에서 행렬을 만드는 프로그램을 만들고 행과 열이 0이 될 때까지 실행하여 24번째 줄로 호출되어 실행한다 둘 중에 0이
 * 되는 값이 있으면 프로그램을 종료한다
 * 
 * @author gyumin
 *
 */

public class Table {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		int row = 0;
		int column = 0;

		makeTable(row, column, input);

	}

	/**
	 * makeTable 함수에서
	 * 입력받은 row와 column을 사용하여 행렬을 만들고
	 * 둘 중애 0이 들어오면 프로그램을 종료한다
	 * 
	 * @param row
	 * @param column
	 * @param input 
	 */
	public static void makeTable(int row, int column, Scanner input) {
		while (true) {
			System.out.print("행의 개수? ");
			row = input.nextInt();
			System.out.print("열의 개수? ");
			column = input.nextInt();
			
			if (row > 0 && column > 0) {
				for (int i = 0; i < row; i++) {
					System.out.println("");
					for (int j = 0; j < column; j++) {
						System.out.print("(" + i + ", " + j + ") ");
					}
				}
			} else
				System.out.println("프로그램을 종료합니다.");
			break;

		}
	}
}
