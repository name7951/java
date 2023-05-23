package week10;

public class MakeMatrix {

	public static void main(String[] args) {

		int[][] arr1 = new int[5][5];
		int[][] arr2 = new int[5][5];
		int[][] arr3 = new int[5][5];

		System.out.println("첫 번째 배열 : ");
		int k = 1;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = k;
				k = k + 1;
			}
		}

		printMatrix(arr1);

		System.out.println("두 번째 배열 : ");
		int l = 1;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[j][i] = l;
				l = l + 1;
			}
		}

		printMatrix(arr2);

		System.out.println("세 번째 배열 : ");
		int m = 1;
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				if (j % 2 == 0) {
					arr3[i][j] = m;
				} else
					arr3[i][j] = m;
				m = m + 1;
			}
		}

		printMatrix(arr3);

	}

	private static void printMatrix(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				System.out.print(array[i][j] + "\t");
			System.out.println();
		}
		System.out.println();
	}

}
