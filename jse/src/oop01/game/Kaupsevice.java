package oop01.game;

import java.util.Scanner;

public class Kaupsevice {
	public static void main(String[] args) {
		KaupVO kaup = new KaupVO();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ű�� �Է����ּ���");
		int height = scanner.nextInt();		
		System.out.println("�����Ը� �Է����ּ���");
		int weight = scanner.nextInt();
				
		kaup.setHeight(height);
		kaup.setWeight(weight);
		kaup.setMsg("");
		kaup.setIdx(kaup.getWeight(),kaup.getHeight());
		System.out.println(kaup);
		
	}
	
}

