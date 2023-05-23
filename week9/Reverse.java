package week9;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] a;
		a = new int[5];
		
		System.out.print("다섯 개의 숫자를 입력하세요 : ");
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
		}
		
		System.out.println("저장된 배열 출력");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("역순으로 출력");
		for (int i = a.length -1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
	}

}
