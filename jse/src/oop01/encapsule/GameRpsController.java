package oop01.encapsule;

import java.util.Scanner;

public class GameRpsController {
	
	public static void main(String[] args) {
		
		GameRpsSevice service = new GameRpsSevice();	
		System.out.println("���������� ������ �����մϴ�.");
		System.out.println("���� : 1, ���� : 2, �� : 3 �Դϴ�. �Է����ּ���");
		Scanner scanner = new Scanner(System.in);
		int playerValue = scanner.nextInt();
		
		System.out.println("�����"+service.showRpsValue(playerValue)+"�� �½��ϴ�.");		
		String comValue = service.displayComValue();
		String winner= service.showWinner();
		System.out.println("��ǻ�ʹ�"+service.displayComValue()+"�� �°�"+"����� "+winner+"�ϴ�.");
		
		scanner.close();
	}

}
