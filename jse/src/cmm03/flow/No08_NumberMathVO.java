package cmm03.flow;

public class No08_NumberMathVO {

	int player, com, count;
	public int game(int com, int player){
		int result;
		if(getPlayer()==getCom()){
			result = 1;
			System.out.println(getPlayer() + "정답 !!");
			
		}else{
			System.out.println("틀렸습니다.");
			System.out.println("컴퓨터가 선택한 값은 "+getCom()+"입니다.");
			result = 0;
		}
		return result;
		
	}
	public int getPlayer() {
		return player;
	}
	public void setPlayer(int player) {
		
		//this.player = player;
		if(player<1||player>5){
			System.out.println("1부터 5까지의 정수만 입력해야 합니다.");
		}
	}

	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = (int)((Math.random()*5)+1);
	}
	public void setCom() {
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
