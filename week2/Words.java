package week2;

import java.util.Scanner;

public class Words {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("연결할 두 단어를 입력해주세요 : ");
		String s1 = input.next();
		String s2 = input.next();
		
		System.out.println(s1 +"  "+ s2);	
		
	}

}
