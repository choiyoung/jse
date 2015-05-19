package oop02.syntax;

public class RpsService {
	
	RpsVO vo = new RpsVO();
	// 컴퓨터가 랜덤을 발생시킨 수 1 ~ 3 까지
	public int displayComVal() {
	
		int comVal=(int)((Math.random()*3)+1);
		vo.setComVal(comVal);
		return comVal;

		
	}
	// 승자를 보여주는 로직
	public String showWinner(int playerVal,int comVal){
		String winner = null;
		comVal =vo.getComVal();
		playerVal =vo.getPlayerVal();
	/*	if(playerVal<comVal){
			if(Math.abs(playerVal-comVal)==2){
				winner="컴퓨터가 이겼습니다.";
			}else{
				winner="사용자가 이겼습니다.";
			}
		}else if(playerVal>comVal){
			if(Math.abs(playerVal-comVal)==2){
				winner="컴퓨터가 이겼습니다.";
			}else{
				winner="사용자가 이겼습니다.";
			}
		}else if(playerVal==comVal){
			winner="비겼습니다.";
		}		
		return winner;*/
		switch(playerVal-comVal){
		case 0 : winner = "비겼습니다."; break;
		case 1 :case -2: winner = "플레이어가 이겼습니다."; break;
		default : winner = "비겼습니다."; 
		}
		return winner;
	}
	// 숫자를 할된 가위, 바위, 보를 문자로 전환해서 보여주는 역할
	public String showRpsVal(int playerVal){
		vo.setPlayerVal(playerVal);
		String result = null;
		switch (playerVal) {
		case 1:  result = "가위";
			
			break;
		case 2: result = "바위";
			break;
		case 3: result = "보";
			break;
		default: result = "1부터 3까지만 가능합니다.";
			
		}
		return result;	
		
	}
	public String comShowRpsVal(int comVal){
		vo.setComVal(comVal);
		String result = null;
		switch (comVal) {
		case 1:  result = "가위";
		
		break;
		case 2: result = "바위";
		break;
		case 3: result = "보";
		break;
		default: result = "1부터 3까지만 가능합니다.";
		
		}
		return result;	
		
	}

}
