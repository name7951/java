package week11;

import java.util.Random;
import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random r = new Random();
		int[] a;
		int[] b = new int[7]; // 7개의 배열 생성

		System.out.print("주사위를 몇 번 던지겟습니까 ? ");
		int dice = input.nextInt(); // 주사위 던질 횟수

		a = new int[dice];
		for (int i = 0; i < dice; i++) {
			a[i] = r.nextInt(6) + 1; // 던져서 나오게 될 숫자 1~6
			if (a[i] == 1) { // 1이 나왔을 경우
				b[1]++; // 인덱스 1 하나 증가
			} else if (a[i] == 2) {
				b[2]++; // 인덱스 2 하나 증가
			} else if (a[i] == 3) {
				b[3]++; // 인덱스 3 하나 증가
			} else if (a[i] == 4) {
				b[4]++; // 인덱스 4 하나 증가
			} else if (a[i] == 5) {
				b[5]++; // 인덱스 5 하나 증가
			} else
				b[6]++; // 인덱스 6 하나 증가

		}

		printArray(a);
		System.out.println();

		printCount(a, b); // 함수 호출

	}

	public static void printCount(int[] a, int[] b) {

		for (int i = 1; i < a.length; i++) {
			System.out.println(i + "의 횟수 : " + b[i]);
		}

	}

	public static void printArray(int[] array) {

		System.out.println("배열에 저장된 값");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();

	}

}
