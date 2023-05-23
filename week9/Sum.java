package week9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) throws FileNotFoundException {

		int[] a;
		a = new int[10];

		printArray(a);

	}

	public static void printArray(int[] a) throws FileNotFoundException {

		Scanner input = new Scanner(new File("D:/201613151/HelloWorld/src/week9/data/test.txt"));
		PrintWriter output = new PrintWriter("D:/201613151/HelloWorld/src/week9/data/result.txt");
		int lineNumber = 1;

		while (input.hasNext()) {
			String line = input.nextLine();
			System.out.println("저장된 배열");
			System.out.print(line + " ");
			System.out.println();
			int sum = 0;
			for (int i = 0; i < a.length; i++) {
				sum = sum + a[i];
			}
			
			output.println("합: " + sum);
			output.println("평균: " + (sum/5));

			lineNumber++;
		}
		input.close();
		output.close();

	}

}
