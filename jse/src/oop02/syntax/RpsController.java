package oop02.syntax;

import java.util.Scanner;

public class RpsController {
public static void main(String[] args) {
	RpsService service = new RpsService();
	System.out.println("���������� ������ �����մϴ�.");
	System.out.println("1.����, 2. ����, 3.���ڱ� �� �Է��ϼ���.");
	Scanner scanner = new Scanner(System.in);
	int playerVal = scanner.nextInt();	
	RpsUtil utill = new RpsUtil();

	
	System.out.println("�÷��̾�� "+service.showRpsVal(playerVal)+"�� �½��ϴ�.");
	int comVal = service.displayComVal();
	System.out.println("��ǻ�ʹ� "+service.comShowRpsVal(comVal)+"�� �½��ϴ�.");
	String winner = service.showWinner(playerVal, comVal);
	System.out.println(winner);
	
}
}
