package week9;

import java.util.Random;

public class Random1 {

	public static void main(String[] args) {

		Random r = new Random();
		int[] a;
		a = new int[10];

		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(100);
		}

		printArray(a);

		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}

		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}

		System.out.println("최대값은 " + max + ", 최소값은 " + min);

	}

	public static void printArray(int[] array) {

		System.out.println("배열에 저장된 값");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();

	}

}
