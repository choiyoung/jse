package oop01.game;

import java.util.Scanner;

public class NumberMatchService {
	NumberMatchVO vo = new NumberMatchVO();
	public void game(int inputParam){
			
			try {
				  int input = inputParam;
				  vo.setPlayer(input);
			} catch (Exception e) {
				System.out.println("���ڴ� �ȵ˴ϴ�.");
			}
				
			if(vo.getPlayer()==vo.getCom()){
				vo.setResult(1);
				System.out.println(vo.getPlayer() + "���� !!");
				
			}else{
				System.out.println("Ʋ�Ƚ��ϴ�.");
				System.out.println("��ǻ�Ͱ� ������ ���� "+vo.getCom()+"�Դϴ�.");
				vo.setResult(0);;
				
			}
			
	}
}


	

	
