package week2;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("두 정수를 입력하세요 : ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		int sum1 = n1+n2;
		
		System.out.println(n1 +  " + " + n2 + " = " + sum1);
		
		System.out.print("두 소수를 입력하세요 : ");
		double n3 = input.nextDouble();
		double n4 = input.nextDouble();
		
		double sum2 = n3+n4;
		
		System.out.printf("%.3f + %.3f = %.3f ", n3, n4, sum2);

		
	}

}
