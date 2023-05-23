package week10;

public class Sum {

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3 };
		int[][] array2 = { { 12, 4 }, { 8, 10, 9 } };
		int[][][] array3 = { { { 1, 12, 7 }, { 6, 4 } }, { { 5, 8 }, { 17, 3, 5 } }, { { 9, 10 }, { 5, 1 } } };

		System.out.println("sum of array1 : "); // 1차원 배열의 모든 값의 합 출력
		System.out.println("sum of array2 : "); // 2차원 배열의 모든 값의 합 출력
		System.out.println("sum of array3 : "); // 3차원 배열의 모든 값의 합 출력

	}

	/*
	 * 한 클래스에 두 개 이상의 메소드가 같은 이름을 가질 수 있는 이유 오버로딩이라고 하고 파라미터 리스트가 서로 다르기 때문에 서로 다른
	 * 타입의 값을 반환하기 때문에 같은 메소드 이름을 가질 수 있다
	 */
	public static int sumOfArray(int array) {

		return array;
	}

	public static int sumOfArray(int array) {

		return array;
	}

	public static int sumOfArray(int array) {

		return array;
	}

}
