package oop01.encapsule;

import java.util.Scanner;

import cmm03.flow.No08_NumberMatchVO;

public class NumberMatchController {
	public static void main(String[] args) {
		NumberMatchService ser = new NumberMatchService();
		Scanner  scanner = new Scanner(System.in);			
		System.out.println("총 3회만 입력가능합니다.");
		System.out.println("1부터 5가지 정수만 입력하세요");
		int input = scanner.nextInt();
		ser.game(input);			
		
		
		}	
}
