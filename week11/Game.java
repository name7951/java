package week11;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random r = new Random();

		int a[] = new int[5]; // 크기가 5인 배열 생성
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(100) + 1; // 배열에 1부터 100ㄲ까지 난수 저장
		}

		printArray(a);
		System.out.println();

		System.out.println("아무 숫자를 입력하면 숫자를 감춥니다.");
		int num = input.nextInt();
		for (int i = 0; i < 100; i++) {
			System.out.println("");
		}

		System.out.println("어던 숫자들이 있었는지 맞춰보세요");
		System.out.println("기회는 5번 입니다.");

		int correct = 0; // 맞춘 숫자 개수를 저장하는 변수

		for (int i = 0; i < 5; i++) {
			int key = input.nextInt();

			if (search(a, a.length, key) != -1) {
				correct++;
			}
		}

		System.out.println("5문제 중 총 " + correct + "개 맞췄습니다!");

	}

	public static void printArray(int[] array) { // 배열을 출력하는 메소드

		System.out.println("기억력 테스트 게임");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();

	}

	public static int search(int[] x, int n, int key) { // 이진 탐색을 수행해서 인덱스를 변환하는 메소드

		int lo = 0;
		int hi = n - 1;
		int mid;

		while (hi >= lo) {
            mid = (hi + lo) / 2;
            if (key == x[mid])
                return mid; // 키를 발견하면 인덱스를 반환
            if (key < x[mid])
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return -1; // 키를 찾지 못한 경우 -1을 반환

	}

}
