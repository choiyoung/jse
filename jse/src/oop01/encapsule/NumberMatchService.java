package oop01.encapsule;

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
			vo.getCom();
				System.out.println(vo.getPlayer() + "���� !!");
				
			}else{
				vo.getCom();
				System.out.println("Ʋ�Ƚ��ϴ�.");
				System.out.println("��ǻ�Ͱ� ������ ���� "+vo.getCom()+"�Դϴ�.");
				
				
			}
			
	}
}


	

	
