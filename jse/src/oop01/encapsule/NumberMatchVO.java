package oop01.encapsule;

public class NumberMatchVO {
	private int player, com, result;
	

	public int getPlayer() {
		return player;
	}
	public void setPlayer(int player) {		
		
		if(player<1||player>5){
			System.out.println("1부터 5까지의 정수만 입력해야 합니다.");
		}
		this.player = player;
	}

	public int getCom() {
		return com;
	}
	public void setCom() {
		this.com = (int)((Math.random()*100)+1);		
	}	
	
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		
		this.result = result;
	}
}
