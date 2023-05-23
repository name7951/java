package week7;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String s = input.nextLine(); // 문장 입력받기 (1)

		String s2, word1, word2, word3, word4, s1, s3;

		System.out.println("문장의 길이 : " + s.length()); // 문장의 길이 출력 (2)

		s2 = s.concat(" reading a book"); // 문자열 연결 (3)
		System.out.println("문자열 연결 : " + s2);

		word1 = s2.substring(10, 13); // s2에서 boy 추출
		word2 = s2.substring(14, 21); // s2에서 reading 추출
		word3 = s2.substring(24, 28); // s2에서 book 추출 (4)

		compareTo(word1, word3); // (5)

		word4 = word2.toUpperCase(); // reading을 대문자로 변환 (6)

		System.out.println("equals() : " + word2.equals(word4)); // 대소문자 구별하여 word2와 word4 비교
		System.out.println("equalsIgnoreCase() : " + word2.equalsIgnoreCase(word4)); // 대소문자 구분없이 word2와 word4 비교
		// (7)

		s3 = s2.replace("i saw the boy reading", "he bought"); // he bought으로 문자열 교체 (8)

		System.out.println("부분 문자열 교체 : " + s3);
		
		char c = s3.charAt(0); // charAt을 사용해서 인덱스를 처음부터 끝까지 c에 저장 (9)
		int count = 0; 
		for (int i = 0; i < c; i++) { //c까지 계속 돌리면서
		/**
			if () { 
				count++; // o와 같다면 count값 1씩 증가
			}
		**/
		}
		System.out.println("'o'의 개수 : " + count);

	}

	private static void compareTo(String w1, String w2) {

/**		if () {
			System.out.println(w1 + w2);
		} else
			System.out.println(w2 + w1);
		
 **/
	}

}
