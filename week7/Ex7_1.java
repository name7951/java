package week7;

public class Ex7_1 {

	public static void main(String[] args) {
		int stackSize = 5;
		char deletedItem;
		ArrayStack S = new ArrayStack(stackSize);

		S.push('A');
		S.printStack();

		S.push('B');
		S.printStack();

		S.push('C');
		S.printStack();

		S.push('D');
		S.push('E');
		S.push('F');
		S.push('G');
		S.printStack();

		deletedItem = S.pop();
		if (deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		deletedItem = S.pop();
		if (deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		deletedItem = S.pop();
		if (deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		S.printStack();

		// pop을 3번 실행하고 스택을 출력하시오.
		deletedItem = S.pop();
		if (deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		deletedItem = S.pop();
		if (deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		deletedItem = S.pop();
		if (deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		S.printStack();

		// pop을 4번 실행하고 스택을 출력하시오.
		deletedItem = S.pop();
		if (deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		deletedItem = S.pop();
		if (deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		deletedItem = S.pop();
		if (deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		deletedItem = S.pop();
		if (deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		S.printStack();
	}
}