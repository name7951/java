package week10;

public class Sum {

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3 };
		int[][] array2 = { { 12, 4 }, { 8, 10, 9 } };
		int[][][] array3 = { { { 1, 12, 7 }, { 6, 4 } }, { { 5, 8 }, { 17, 3, 5 } }, { { 9, 10 }, { 5, 1 } } };

		System.out.println("sum of array1 : " + sumOfArray(array1)); // 1차원 배열의 모든 값의 합 출력
		System.out.println("sum of array2 : " + sumOfArray(array2)); // 2차원 배열의 모든 값의 합 출력
		System.out.println("sum of array3 : " + sumOfArray(array3)); // 3차원 배열의 모든 값의 합 출력

	}

	/**
	 * 파라미터 리스트가 서로 다르면 오버로딩이 가능하고 오버로딩이 된 메소드들은 서로 다른 타입의 값을 반환할 수도 있다 이렇게 두 개 이상의
	 * 메소드가 같은 이름을 가질 수 있다
	 */

	public static int sumOfArray(int[] array1) {
		int sum = 0;
		for (int i = 0; i < array1.length; i++) {
			sum = sum + array1[i];
		}
		return sum;
	}

	public static int sumOfArray(int[][] array2) {
		int sum = 0;
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				sum = sum + array2[i][j];
			}
		}
		return sum;
	}

	public static int sumOfArray(int[][][] array3) {
		int sum = 0;
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++) {
				for (int k = 0; k < array3[i][j].length; k++) {
					sum += array3[i][j][k];
				}
			}
		}
		return sum;
	}

}
