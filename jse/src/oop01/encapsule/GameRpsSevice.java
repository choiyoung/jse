package oop01.encapsule;

public class GameRpsSevice {
	
	/*
	 
	 숫자값에 따른 가위, 바위, 보 결정로직
	 
	  */
	
	public String showRpsValue(int playerValue) {
		String result = null;
		switch (playerValue) {
		case 1:  result = "가위";
			
			break;
		case 2: result = "바위";
			break;
		case 3: result = "보";
		default: result = "1부터 3까지만 가능합니다.";
			break;
		}
		return result;
	
		
	}

	public String displayComValue() {
		String result = null;
		int comvalue = (int)(Math.random()*3)+1;
		switch (comvalue) {
		case 1:  result = "가위";			
			break;
		case 2: result = "바위";
			break;
		case 3: result = "보";
		default: result = "1부터 3까지만 가능합니다.";
			break;
		}
		return result;
		
	}

	public String showWinner( ) {
		
		
	return null;
}
}