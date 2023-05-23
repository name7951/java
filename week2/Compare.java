package week2;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {

		System.out.print("비교할 두 정수를 입력해주세요 : ");
		
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		if (n1 > n2) {
			System.out.println("첫 번째 값이 더 큽니다.");
		} else if (n1 < n2) {
			System.out.println("두 번째 값이 더 큽니다.");
		} else
			System.out.println("두 값이 똑같습니다.");
	}

}
