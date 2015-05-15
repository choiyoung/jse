package oop01.encapsule;

import java.util.Scanner;

public class NumberMatchService {
	NumberMatchVO vo = new NumberMatchVO();
	public void game(int inputParam){
			
			try {
				  int input = inputParam;
				  vo.setPlayer(input);
			} catch (Exception e) {
				System.out.println("문자는 안됩니다.");
			}
				
			if(vo.getPlayer()==vo.getCom()){
			vo.getCom();
				System.out.println(vo.getPlayer() + "정답 !!");
				
			}else{
				vo.getCom();
				System.out.println("틀렸습니다.");
				System.out.println("컴퓨터가 선택한 값은 "+vo.getCom()+"입니다.");
				
				
			}
			
	}
}


	

	
