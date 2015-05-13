package cmm04.arry;

import java.util.Scanner;

public class No03_ForLoopArrayDemo {
	public static void main(String[] args) {
		No03_ForLoopVO loop = new No03_ForLoopVO();
		Scanner scanner = new Scanner(System.in);

		System.out.println("5개의 수를 입력 해주세요");

		System.out.print("a값 입력 : ");
		int a = scanner.nextInt();

		System.out.print("b값 입력 : ");
		int b = scanner.nextInt();

		System.out.print("c값 입력 : ");
		int c = scanner.nextInt();

		System.out.print("d값 입력 : ");
		int d = scanner.nextInt();

		System.out.print("e값 입력 : ");
		int e = scanner.nextInt();

		loop.loop(a, b, c, d, e);

	}

}
