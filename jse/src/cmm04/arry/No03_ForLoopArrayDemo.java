package cmm04.arry;

import java.util.Scanner;

public class No03_ForLoopArrayDemo {
	public static void main(String[] args) {
		No03_ForLoopVO loop = new No03_ForLoopVO();
		Scanner scanner = new Scanner(System.in);

		System.out.println("5���� ���� �Է� ���ּ���");

		System.out.print("a�� �Է� : ");
		int a = scanner.nextInt();

		System.out.print("b�� �Է� : ");
		int b = scanner.nextInt();

		System.out.print("c�� �Է� : ");
		int c = scanner.nextInt();

		System.out.print("d�� �Է� : ");
		int d = scanner.nextInt();

		System.out.print("e�� �Է� : ");
		int e = scanner.nextInt();

		loop.loop(a, b, c, d, e);

	}

}
