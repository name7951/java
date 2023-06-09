package week11;

import java.util.Random;

public class PracticeSort {

	public static void main(String[] args) {

		Random r = new Random();
		int a[] = new int[10]; // 크기가 10인 배열 생성

		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(100) + 1; // 배열에 1부터 100ㄲ까지 난수 저장
		}

		printArray(a);
		System.out.println();

		sort(a, 10);
		System.out.println("삽입 정렬된 배열");
		for (int j = 0; j < 10; j++)
			System.out.print(a[j] + " ");
		System.out.println();

	}

	public static void printArray(int[] array) { // 배열을 출력하는 메소드

		System.out.println("처음 배열");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();

	}

	public static void sort(int[] x, int n) { // 삽입 정렬을 수행하는 메소드

		for (int i = 1; i < n; i++) {
			insert(x, i); // 배열의 i번째 요소를 삽입 정렬
		}

	}

	public static void insert(int[] x, int i) { // 삽입 정렬을 수행하는 메소드

		int temp = x[i]; // 삽입할 값을 변수에 저장

		int j = i - 1;
		while (j >= 0 && temp < x[j]) {
			x[j + 1] = x[j]; // 오른쪽으로 한 칸 이동
			j--;
		}
		x[j + 1] = temp; // 삽입할 값을 맞는 위치에 삽입

	}

}
