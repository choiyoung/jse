package oop02.syntax;

public class RpsService {
	
	RpsVO vo = new RpsVO();
	// ��ǻ�Ͱ� ������ �߻���Ų �� 1 ~ 3 ����
	public int displayComVal() {
	
		int comVal=(int)((Math.random()*3)+1);
		vo.setComVal(comVal);
		return comVal;

		
	}
	// ���ڸ� �����ִ� ����
	public String showWinner(int playerVal,int comVal){
		String winner = null;
		comVal =vo.getComVal();
		playerVal =vo.getPlayerVal();
	/*	if(playerVal<comVal){
			if(Math.abs(playerVal-comVal)==2){
				winner="��ǻ�Ͱ� �̰���ϴ�.";
			}else{
				winner="����ڰ� �̰���ϴ�.";
			}
		}else if(playerVal>comVal){
			if(Math.abs(playerVal-comVal)==2){
				winner="��ǻ�Ͱ� �̰���ϴ�.";
			}else{
				winner="����ڰ� �̰���ϴ�.";
			}
		}else if(playerVal==comVal){
			winner="�����ϴ�.";
		}		
		return winner;*/
		switch(playerVal-comVal){
		case 0 : winner = "�����ϴ�."; break;
		case 1 :case -2: winner = "�÷��̾ �̰���ϴ�."; break;
		default : winner = "�����ϴ�."; 
		}
		return winner;
	}
	// ���ڸ� �ҵ� ����, ����, ���� ���ڷ� ��ȯ�ؼ� �����ִ� ����
	public String showRpsVal(int playerVal){
		vo.setPlayerVal(playerVal);
		String result = null;
		switch (playerVal) {
		case 1:  result = "����";
			
			break;
		case 2: result = "����";
			break;
		case 3: result = "��";
			break;
		default: result = "1���� 3������ �����մϴ�.";
			
		}
		return result;	
		
	}
	public String comShowRpsVal(int comVal){
		vo.setComVal(comVal);
		String result = null;
		switch (comVal) {
		case 1:  result = "����";
		
		break;
		case 2: result = "����";
		break;
		case 3: result = "��";
		break;
		default: result = "1���� 3������ �����մϴ�.";
		
		}
		return result;	
		
	}

}
