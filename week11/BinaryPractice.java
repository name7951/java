package week11;

import java.util.Random;
import java.util.Scanner;

public class BinaryPractice {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
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
		System.out.println();

		System.out.print("어떤 숫자의 위치를 찾겠습니까??");
		int key = input.nextInt();
		int pos = search(a, 10, key);

		if (pos >= 0)
			System.out.println(key + "는 " + pos + "번째 인덱스 입니다.");
		else
			System.out.println(key + "는 저장되어 있는 숫자가 아닙니다.");

	}

	public static void printArray(int[] array) {

		System.out.println("처음 배열");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();

	}

	public static void sort(int[] x, int n) { // 배열의 n개 원소를 정렬한다

		for (int i = 1; i < n; i++) {
			insert(x, i);
		}

	}

	public static void insert(int[] x, int i) { // x[i]를 이미 정렬된 값들 사이 중 올바른 위치에 끼워 넣는 함수

		int temp = x[i];

		int j = i - 1;
		while (j >= 0 && temp < x[j]) {
			x[j + 1] = x[j];
			j--;
		}
		x[j + 1] = temp;

	}

	public static int search(int[] x, int n, int key) {

		int lo = 0;
		int hi = n - 1;
		int mid;

		while (hi >= lo) {
			mid = (hi + lo) / 2;
			if (key == x[mid]) // 키를 발견
				return mid; // 인덱스를 반환
			if (key < x[mid])
				hi = mid - 1;
			else
				lo = mid + 1;
		}
		return -1; // 키를 찾지 못함

	}

}