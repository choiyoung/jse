package oop01.encapsule;

public class GameRpsSevice {
	
	/*
	 
	 ���ڰ��� ���� ����, ����, �� ��������
	 
	  */
	
	public String showRpsValue(int playerValue) {
		String result = null;
		switch (playerValue) {
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

	public String displayComValue() {
		String result = null;
		int comvalue = (int)((Math.random()*3)+1);
		switch (comvalue) {
		case 1:  result = "����";			
			break;
		case 2: result = "����";
			break;
		case 3: result = "��";
		default: result = "1���� 3������ �����մϴ�.";
			break;
		}	
		return result;
		
	}

	public String showWinner() {
		
		
		
	return null;
}
}