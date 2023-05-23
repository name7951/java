package week4;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number; // 누르는 번호
		int input; // 입금금액
		int output; // 출금금액
		int balance = 5000; // 현재 가지고 있는 돈
		int count = 0;

		while (true) {
			System.out.println("ATM 프로그램입니다. 번호를 입력하세요");
			System.out.println("잔액 확인 --> 1"); // 잔액확인
			System.out.println("현금 인출 --> 2"); // 출금
			System.out.println("현금 입금 --> 3"); // 입금
			System.out.println("종    료 --> 4"); // 종료
			System.out.println("---------------------------");
			System.out.print("번호 입력 : ");
			number = sc.nextInt();
			if (number == 1) { // 잔액확인
				System.out.println("잔액은 " + balance + "원 입니다");
				System.out.println("");

			} else if (number == 3) { // 입금
				System.out.print("입금할 금액은 ? : ");
				input = sc.nextInt();
				balance = input + balance;
				System.out.println("잔액은 " + balance + "원 입니다");
				System.out.println("");

			} else if (number == 2) { // 출금
				System.out.print("출금할 금액은 ? : ");
				output = sc.nextInt();
				if (output > balance) { // 출금할 금액이 잔액보다 많을 경우
					System.out.println("돈이 부족합니다");
				}
				balance = balance - output;
				System.out.println("돈을 받으세요.");
				System.out.println("잔액은 " + balance + "원 입니다");
				System.out.println("");

			} else if (number == 4) { // 종료
				System.out.println("종료합니다");
				count++;
				System.out.println("총 거래 횟수는 " + count + "입니다");
				break;

			} else {
				System.out.println("올바리지 않은 번호입니다");
			}

		}

	}

}
