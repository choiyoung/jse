package oop02.syntax;
/*
 Date :
 Author :
 Desc : static 예제
 */
public class CardVO {
	public String kind;// 카드의 무늬
	public int number;// 카드의 숫자
	static int wiath = 100;// 카드의 폭
	static int height = 250;// 카드의 높이
	public String com;
	
	public  CardVO(String kind,int number){
		this.kind= kind;
		this.number=number;		
		this.com="spade 5";
	}
	
}
