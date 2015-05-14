package oop01.game;

import java.util.Scanner;

public class Kaupsevice {
	public static void main(String[] args) {
		KaupVO kaup = new KaupVO();
		Scanner scanner = new Scanner(System.in);
		System.out.println("키를 입력해주세요");
		int height = scanner.nextInt();		
		System.out.println("몸무게를 입력해주세요");
		int weight = scanner.nextInt();
				
		kaup.setHeight(height);
		kaup.setWeight(weight);
		kaup.setMsg("");
		kaup.setIdx(kaup.getWeight(),kaup.getHeight());
		System.out.println(kaup);
		
	}
	
}

