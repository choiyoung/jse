package oop01.encapsule;

import java.util.Scanner;

public class GameRpsController {
	
	public static void main(String[] args) {
		
		GameRpsSevice service = new GameRpsSevice();	
		System.out.println("가위바위보 게임을 시작합니다.");
		System.out.println("가위 : 1, 바위 : 2, 보 : 3 입니다. 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		int playerValue = scanner.nextInt();
		
		System.out.println("당신은"+service.showRpsValue(playerValue)+"를 냈습니다.");		
		String comValue = service.displayComValue();
		String winner= service.showWinner();
		System.out.println("컴퓨터는"+service.displayComValue()+"을 냈고"+"결과는 "+service.showWinner()+"니다.");
		
		scanner.close();
	}

}
