package oop02.syntax;

public class CardMain {

	public static void main(String[] args) {
		
		System.out.println("카드 높이 : "+CardVO.height);
		System.out.println("카드 너비 : "+CardVO.wiath);
		
		// 인스턴스 생성하여 아래 결과가 나오도록 출력하라
		CardVO vo = new CardVO("heart",3);
		
		System.out.println("플레이어는 "+vo.kind+" "+vo.number+"이고");//heart,spade
		System.out.println("컴퓨터는 "+vo.com+"라서 컴퓨터가 이겼습니다.");
	}

}
