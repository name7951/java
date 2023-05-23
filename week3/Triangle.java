package week3;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {

		int n;
		Scanner input = new Scanner(System.in);
		
		System.out.print("삼각형의 층 수 입력: ");
		n = input.nextInt();
		System.out.println();
		
		for (int i = 0; i < n; i++, n--) {
			for (int j = n-1 ; j > 0 ; j--) 
				System.out.print(" ");
						
			for (int k = 0; k <= i; k++) 
				System.out.print("*");
		
			System.out.println();
			
		}
		
		input.close();
		
	}

}
