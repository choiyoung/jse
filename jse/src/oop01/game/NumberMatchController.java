package oop01.game;

import java.util.Scanner;

import cmm03.flow.No08_NumberMatchVO;

public class NumberMatchController {
	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);		
		NumberMatchService ser = new NumberMatchService();
		System.out.println("�� 3ȸ�� �Է°����մϴ�.");
		System.out.println("1���� 5���� ������ �Է��ϼ���");
		int input = scanner.nextInt();
		ser.game(input);
		
		ser.vo.getCom();
	
		
		
		
		
		}	
}
