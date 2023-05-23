package week9;

import java.util.Random;

public class Change {

	public static void main(String[] args) {

		Random r = new Random();
		int[] a;
		a = new int[10];

		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(100);
		}

		printArray(a);

		System.out.println();

		System.out.println("수정된 배열");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				a[i] = a[i] + 1;
			}
			System.out.print(a[i] + " ");
		}

	}

	public static void printArray(int[] a) {
		
		System.out.println("배열에 저장된 값");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();

	}
	
}
